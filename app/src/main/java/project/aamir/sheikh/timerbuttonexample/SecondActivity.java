package project.aamir.sheikh.timerbuttonexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import project.aamir.sheikh.timerbutton.TimerButton;

/**
 * Created by Aamir on 23-02-2017.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2nd);
        TimerButton btn=(TimerButton) findViewById(R.id.btn);
        btn.setFinishTime(10);
        btn.setInterval(1000);
        btn.setTimerText("Next");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                finish();
            }
        });
        findViewById(R.id.reject).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
