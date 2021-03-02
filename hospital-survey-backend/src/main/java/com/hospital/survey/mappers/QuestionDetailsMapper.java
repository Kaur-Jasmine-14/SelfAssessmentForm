package com.hospital.survey.mappers;

import com.hospital.survey.models.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionDetailsMapper
{
    public static List<Question> mapJsonToQuestions(Map<String, String> questions) {
        List<Question> questionList = new ArrayList<>();

        for(Map.Entry<String, String> entry : questions.entrySet()) {
            if(entry.getKey().equalsIgnoreCase("haveTroubleBreating")) {
                questionList.add(new Question("Are you having difficulty breathing? For example,do you feel like you’re out of breath or suffocating? OR Do you have a lot of trouble breathing even when at rest,such as shortness of breath that makes it hard to speak?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("ageranges")) {
                questionList.add(new Question("Please select an age range.", entry.getValue()));
            }
        }

        return questionList;
    }

}
