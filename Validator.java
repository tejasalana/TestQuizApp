package com.example.mytestquiz;

public class Validator {
    public String validate(int noOfQuestions, int score){
        if(score >= (noOfQuestions*0.5))
        return "Pass";
        return "Fail";
    }
}
