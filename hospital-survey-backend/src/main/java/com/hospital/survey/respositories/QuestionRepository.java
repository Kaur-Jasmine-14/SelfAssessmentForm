package com.hospital.survey.respositories;

import com.hospital.survey.models.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>
{
    Question findByQuestion(String question);
}
