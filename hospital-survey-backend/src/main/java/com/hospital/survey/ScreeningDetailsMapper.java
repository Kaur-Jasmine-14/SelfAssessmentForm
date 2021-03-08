package com.hospital.survey.mappers;

import com.hospital.survey.models.Screening;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionDetailsMapper
{
    public static List<Screening> mapJsonToQuestions(Map<String, String> questions) {
        List<Screening> questionList = new ArrayList<>();

        for(Map.Entry<String, String> entry : questions.entrySet()) {
            if(entry.getKey().equalsIgnoreCase("Reason")) {
                questionList.add(new Screening("Please select the reason that best applies to your situation:", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("symptoms")) {
                questionList.add(new Screening("Have you had symptoms of COVID-19?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("quarantine")) {
                questionList.add(new Screening("Have you received quarantine instructions from Public Health, your employer or a close friend or family member?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("14days-options")) {
                questionList.add(new Screening("Have you engaged in risky behavior within the last 14 days?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("work-environment")) {
                questionList.add(new Screening("In your work environment, do you frequent people who have COVID-19?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("professional-work")) {
                questionList.add(new Screening("In the course of your professional work or occupations, are you in a closed environment with people outside your family bubble for more than 15 minutes in all?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("bubble")) {
                questionList.add(new Screening("Except for your work and grocery shopping obligations, do you always remain inside your family bubble?", entry.getValue()));
            } else if(entry.getKey().equalsIgnoreCase("one-of-the-situations")) {
                questionList.add(new Screening("Are you or the person who is going to get tested in one of the situations below?", entry.getValue()));
            }
        }

        return questionList;
    }

}
