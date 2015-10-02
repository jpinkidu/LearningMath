package jpinkidu.learningmath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TestResult extends AppCompatActivity {

    private TextView mScoreResult;
    private TextView mScoreLabel;
    private TextView mPointLabel;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        mScoreLabel = (TextView) findViewById(R.id.yourScoreResult);
        mScoreResult = (TextView) findViewById(R.id.yourScoreResult);
        mPointLabel = (TextView) findViewById(R.id.pointLabel);

        Intent intent = getIntent();

        name = intent.getStringExtra(getString(R.string.key_name));
        mScoreResult.setText(name);



    }


}
