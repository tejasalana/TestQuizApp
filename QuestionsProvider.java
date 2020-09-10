package com.example.mytestquiz;

public class QuestionsProvider {
    int noOfQuestions = 5;
    String mquestions[] = {
            "Who is prime minister of india?",
            "Which of these is not a bitwise operator?",
            "Which keyword is used by method to refer to the object that invoked it?",
            "Which of these keywords is used to define interfaces in Java?",
            "Which of these access specifiers can be used for an interface?",
            "Which of the following is correct way of importing an entire package ‘pkg’?",
            "What is the return type of Constructors?",
            "Which of the following package stores all the standard java classes?",
            "Which of these method of class String is used to compare two String objects for their equality?",
            "An expression involving byte, int, & literal numbers is promoted to which of these?"
    };


    String mCorrectAnswers[] = {"modi","<=","this","interface","public","import pkg.*","None of the mentioned","java","equals()","int"};
    String mchoice[][] = {
            {"modi","trump","obama","kim"},
            {"&","&=","|=","<="},
            {"import","this","catch","abstract"},
            {"interface","inter","intf","faceinter"},
            {"public","protected","private","All of the mentioned"},
            {"Import pkg.","import pkg.*","Import pkg.*","import pkg."},
            {"int","float","void","None of the mentioned"},
            {"lang","java","util","java.packages"},
            {"equals()","Equals()","isequal()","Isequal()"},
            {"int","long","byte","float"}
    };
    public int getNoOfQuestion(){
        return noOfQuestions;
    }

    public String getQuestion(int a){
        return mquestions[a];
    }

    public String getChoice1(int a){
        return mchoice[a][0];
    }

    public String getChoice2(int a){
        return mchoice[a][1];
    }

    public String getChoice3(int a){
        return mchoice[a][2];
    }

    public String getChoice4(int a){
        return mchoice[a][3];
    }

    public String getCorrectAnswer(int a){
        return mCorrectAnswers[a];
    }

}
