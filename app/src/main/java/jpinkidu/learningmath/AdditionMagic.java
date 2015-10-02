package jpinkidu.learningmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class AdditionMagic extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getSimpleName();

    private TextView mFirstNum;
    private TextView mSecNum;
    private TextView mSolution;

    private Button mNewTaskBtn;
    private Button mAnswerBtn;
    //Layout
    private TextView mAnswerLabel;
    private TextView mQuestionNumLabel;
    private TextView mOperationLabel;
    private TextView mEqualLabel;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_magic);
        // check on Operation
        Intent intent = getIntent();
        name = intent.getStringExtra(getString(R.string.key_name));

        Log.v(TAG,"Op "+ name);


        mAnswerLabel = (TextView)findViewById(R.id.answerLabel);
            mAnswerLabel.setVisibility(View.INVISIBLE);
            mQuestionNumLabel = (TextView)findViewById(R.id.questionNumLabel);
            mQuestionNumLabel.setVisibility(View.INVISIBLE);
            mOperationLabel = (TextView) findViewById(R.id.operationLabel);
            mOperationLabel.setVisibility(View.INVISIBLE);
            mEqualLabel = (TextView) findViewById(R.id.equalLabel);
            mEqualLabel.setVisibility(View.INVISIBLE);

            mFirstNum = (TextView) findViewById(R.id.firstNumLabel);
            mSecNum = (TextView) findViewById(R.id.secNumLabel);
            mSolution = (TextView) findViewById(R.id.solutionLabel);
            mNewTaskBtn = (Button) findViewById(R.id.newTaskBtn);
            mAnswerBtn = (Button) findViewById(R.id.answerButton);
            mAnswerBtn.setVisibility(View.INVISIBLE);

            //get new numbers
            mNewTaskBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mAnswerLabel.setVisibility(View.VISIBLE);
                    mQuestionNumLabel.setVisibility(View.VISIBLE);
                    mOperationLabel.setVisibility(View.VISIBLE);
                    mEqualLabel.setVisibility(View.VISIBLE);
                    mAnswerBtn.setVisibility(View.VISIBLE);
                    mNewTaskBtn.setVisibility(View.INVISIBLE);
                    mSolution.setVisibility(View.INVISIBLE);
                    // create random numbers
                    getFirstNum();
                    getSecNum();
                    incrementAnswerNum();


                }
            });
            mAnswerBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getResult();
                    mNewTaskBtn.setVisibility(View.VISIBLE);
                    mSolution.setVisibility(View.VISIBLE);
                    mAnswerBtn.setVisibility(View.INVISIBLE);

                }
            });


        }





    private void incrementAnswerNum(){

     int i = Integer.parseInt((String) mQuestionNumLabel.getText());
     i = i + 1;
     if (i <=10) {
         for (int j = 0; j <= 10; j++) {
            String text = Integer.toString(i);
            mQuestionNumLabel.setText(text);
        }
        }else{
            goToMain();
        }
    }

    private void goToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    private void getFirstNum() {
        int random1;
        Random randomGen1 = new Random();
        random1 = randomGen1.nextInt(10);
        String randNum1 = Integer.toString(random1);
        mFirstNum.setText(randNum1);
        Log.v(TAG, "FirstNum " + random1);
    }



    private void getSecNum() {

        int random2;
        Random randomGen = new Random();
        random2 = randomGen.nextInt(10);
        String randNum = Integer.toString(random2);
        mSecNum.setText(randNum);
        Log.v(TAG, "SecNum " + random2);
    }




    private void getResult() {
        int sum;

        int firstNumber = Integer.parseInt((String) mFirstNum.getText());
        int secNumber = Integer.parseInt((String) mSecNum.getText());
        sum = firstNumber+secNumber;

        Log.v(TAG, "Sum" + sum);
        String sumText = Integer.toString(sum);
        mSolution.setText(sumText);

    }
}
