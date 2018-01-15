import { Component } from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Our Survey';
  questions: string[];

  // Inject HttpClient into your component or service.
  constructor(private http: HttpClient) {};

  ngOnInit(): void {
    this.questions=[];
    // Make the HTTP request:
    this.http.get('/questions').subscribe(data => {
      console.log(data['_embedded']['questions']);
      for (var value of data['_embedded']['questions']) {
        this.questions.push(value.text);
      }
      
    });
  }
}
