package com.hospital.survey.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "questions")
public class Question
{
    @Id
    @GeneratedValue
    private Long id;
    private String question;
    private String answer;

    public Question()
    {
    }

    public Question(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getAnswer()
    {
        return answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
}
