package com.example.mytestquiz;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView question,currentQuestion;
    private Button btn1,btn2,btn3,btn4;
    private int score = 0;
    private String Answer = "";
    private int countQuestions = 0;

    private QuestionsProvider questionsProvider = new QuestionsProvider();
    private int noOfQuestions = questionsProvider.getNoOfQuestion();
    private Validator validator = new Validator();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        question = (TextView) findViewById(R.id.QuestionTextView);
        currentQuestion = (TextView) findViewById(R.id.textView);
        updateQuestion(countQuestions);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                countQuestions++;
                if(btn1.getText() == Answer){
                    score++;
                }
                checkToExit(countQuestions);
                updateQuestion(countQuestions);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                countQuestions++;
                if(btn2.getText() == Answer){
                    score++;
                }
                checkToExit(countQuestions);
                updateQuestion(countQuestions);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                countQuestions++;
                if(btn3.getText() == Answer){
                    score++;
                }
                checkToExit(countQuestions);
                updateQuestion(countQuestions);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                countQuestions++;
                if(btn4.getText() == Answer){
                    score++;
                }
                checkToExit(countQuestions);
                updateQuestion(countQuestions);
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void updateQuestion(int num)
    {
        currentQuestion.setText("No of questions: "+noOfQuestions+"          Current question: "+(countQuestions+1));
        question.setText(questionsProvider.getQuestion(num));
        btn1.setText(questionsProvider.getChoice1(num));
        btn2.setText(questionsProvider.getChoice2(num));
        btn3.setText(questionsProvider.getChoice3(num));
        btn4.setText(questionsProvider.getChoice4(num));

        Answer = questionsProvider.getCorrectAnswer(num);
    }

    private void checkToExit(int num){
        if(num == noOfQuestions)
        {
            final String result = validator.validate(noOfQuestions,score);
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Quiz completed. want to see your score");
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    question.setText("Your score is "+ score + " and result is "+result);
                    currentQuestion.setText("Thank you for taking test....No of questions: "+noOfQuestions);
                    btn1.setText("");
                    btn2.setText("");
                    btn3.setText("");
                    btn4.setText("");
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }


}
