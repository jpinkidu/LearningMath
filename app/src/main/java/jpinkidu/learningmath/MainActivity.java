package jpinkidu.learningmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mAdditionButton;
    private Button mSubtractionButton;
    private Button mMultiplicationButton;
    private Button mDivisionButton;
    private Button mTestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdditionButton = (Button) findViewById(R.id.startAddition);
        mSubtractionButton = (Button) findViewById(R.id.startSubtraction);
        mMultiplicationButton = (Button) findViewById(R.id.startMultiplication);
        mDivisionButton = (Button) findViewById(R.id.startDivision);
        mTestButton = (Button)findViewById(R.id.testButton);
        mAdditionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAddition();

            }
        });

        mSubtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSubtraction();

            }
        });

        mMultiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMultiplication();
            }
        });

        mDivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDivision();
            }
        });

        mTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTestcenter();
            }
        });

    }

    private void startTestcenter() {
        Intent intent = new Intent(this, TestAddMagic.class);

        startActivity(intent);
    }


    private void startAddition() {
        Intent intent = new Intent(this, AdditionMagic.class);

        startActivity(intent);
    }
    private void startSubtraction() {
        Intent intent = new Intent(this, SubtractionMagic.class);
        startActivity(intent);
    }
    private void startMultiplication() {
        Intent intent = new Intent(this, MultiplicationMagic.class);
        startActivity(intent);
    }
    private void startDivision() {
        Intent intent = new Intent(this, DivisionMagic.class);
        startActivity(intent);
    }


}
