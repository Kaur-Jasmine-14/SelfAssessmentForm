package com.hospital.survey.controllers;

import com.hospital.survey.mappers.QuestionDetailsMapper;
import com.hospital.survey.models.Question;
import com.hospital.survey.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins = "*")
public class QuestionController
{
    @Autowired
    private QuestionService questionService;

    @PostMapping("/save")
    public void saveQuestion(Question question) {
        questionService.save(question);
    }

    @PostMapping("/saveAll")
    public void saveQuestions(@RequestBody Map<String, String> questions) {

        questionService.findUpdateAndSaveAll(questions);
    }


}
