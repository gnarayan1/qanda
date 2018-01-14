
package org.surveysite.surveryapp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "answers", path = "answers")
public interface AnswerRepository extends MongoRepository<Answer, String> {


}
