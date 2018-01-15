import { Component } from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Our Survey';
  questions: string[];
  answers: {'questionId': string, 'rating': number, 'comment':string}[];
  currentRate = 8;

  // Inject HttpClient into your component or service.
  constructor(private http: HttpClient) {};

  ngOnInit(): void {
    this.questions=[];
    this.answers=[];
    // Make the HTTP request:
    this.http.get('/questions').subscribe(data => {
      
      for (var question of data['_embedded']['questions']) {
        this.questions.push(question.text);
        const qIdHref = question._links.self.href;
        const qId = qIdHref.substring(qIdHref.lastIndexOf('/'));
        const canswer = {'questionId': qId, 'rating': this.currentRate, comment: ''  };
        this.answers.push(canswer);
        console.log(canswer);     
      }
      
    });
  }
}
