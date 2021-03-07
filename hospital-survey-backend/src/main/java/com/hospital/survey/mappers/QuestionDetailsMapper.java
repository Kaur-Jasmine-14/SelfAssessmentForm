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
            } else if(entry.getKey().equalsIgnoreCase("agerange1")) {
                questionList.add(new Question("Is your child experiencing ANY symptoms?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("same-text-options")) {
                questionList.add(new Question("Are you experiencing ANY symptoms?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("any_2_of_symptoms-option")) {
                questionList.add(new Question("Are you experiencing any 2 of the following symptoms?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("one_of_the_situations-option")) {
                questionList.add(new Question("Are you or the person who is going to get tested in one of the situations below?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("one_of_the_situations-option")) {
                questionList.add(new Question("Are you or the person who is going to get tested in one of the situations below?", entry.getValue()));
            }
        }

        return questionList;
    }

}
