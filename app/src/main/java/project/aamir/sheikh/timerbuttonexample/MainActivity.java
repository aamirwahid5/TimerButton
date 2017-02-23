package project.aamir.sheikh.timerbuttonexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import project.aamir.sheikh.timerbutton.TimerButton;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerButton btn=(TimerButton) findViewById(R.id.btn);
        btn.setFinishTime(10);
        btn.setInterval(1000);
        btn.setOnTimerCompleteListener(new TimerButton.onTimeCompleteListener() {
            @Override
            public void onTimeCompleted() {
                Toast.makeText(MainActivity.this, "Completed", Toast.LENGTH_SHORT).show();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                finish();
            }
        });
        findViewById(R.id.reject).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn.setTimerText("Next");
    }
}
