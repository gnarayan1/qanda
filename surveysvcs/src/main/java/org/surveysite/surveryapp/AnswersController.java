package org.surveysite.surveryapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
public class AnswersController {
	
		
	@Autowired
	private AnswerRepository answerRepository;
	
	@RequestMapping(method = RequestMethod.POST, value = "/answers/many")
    public @ResponseBody ResponseEntity<?> saveMany(@RequestBody List<Answer> answers) {
        return ResponseEntity.ok(answerRepository.save(answers));
    }
	
	

}
