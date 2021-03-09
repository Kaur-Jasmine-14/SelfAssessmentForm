package com.hospital.survey.services;

import com.hospital.survey.mappers.QuestionDetailsMapper;
import com.hospital.survey.mappers.ScreeningDetailsMapper;
import com.hospital.survey.models.Question;
import com.hospital.survey.models.Screening;
import com.hospital.survey.respositories.QuestionRepository;
import com.hospital.survey.respositories.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ScreeningService
{
    @Autowired
    private ScreeningRepository repository;

    public Screening save(Screening question) {
        return repository.save(question);
    }

    public List<Screening> saveAll(List<Screening> questions) {
        return (List<Screening>) repository.saveAll(questions);
    }

    public Screening findByQuestion(String question) {
        return repository.findByQuestion(question);
    }

    public List<Screening> findUpdateAndSaveAll(Map<String, String> questions) {
        List<Screening> questionList = ScreeningDetailsMapper.mapJsonToQuestions(questions);

        for(int i=0; i < questionList.size(); i++) {
            Screening existingQuestion = findByQuestion(questionList.get(i).getQuestion());

            if(existingQuestion != null) {
                existingQuestion.setAnswer(questionList.get(i).getAnswer());
                questionList.set(i, existingQuestion);
            }
        }

        return saveAll(questionList);
    }

}
