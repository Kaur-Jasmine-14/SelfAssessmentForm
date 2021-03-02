package com.hospital.survey.services;

import com.hospital.survey.mappers.QuestionDetailsMapper;
import com.hospital.survey.models.Question;
import com.hospital.survey.respositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionService
{
    @Autowired
    private QuestionRepository repository;

    public Question save(Question question) {
        return repository.save(question);
    }

    public List<Question> saveAll(List<Question> questions) {
        return (List<Question>) repository.saveAll(questions);
    }

    public Question findByQuestion(String question) {
        return repository.findByQuestion(question);
    }

    public List<Question> findUpdateAndSaveAll(Map<String, String> questions) {
        List<Question> questionList = QuestionDetailsMapper.mapJsonToQuestions(questions);

        for(int i=0; i < questionList.size(); i++) {
            Question existingQuestion = findByQuestion(questionList.get(i).getQuestion());

            if(existingQuestion != null) {
                existingQuestion.setAnswer(questionList.get(i).getAnswer());
                questionList.set(i, existingQuestion);
            }
        }

        return saveAll(questionList);
    }

}
