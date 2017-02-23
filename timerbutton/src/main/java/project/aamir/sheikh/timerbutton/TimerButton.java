package project.aamir.sheikh.timerbutton;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Aamir on 23-02-2017.
 */

public class TimerButton extends Button {

    private int usrTime = 0;
    private long interval = 0;
    private String timerText = "";
    private onTimeCompleteListener completeListener;

    public void setOnTimerCompleteListener(onTimeCompleteListener listener) {
        this.completeListener = listener;
    }

    public TimerButton(Context context) {
        super(context);

        init();
    }

    public TimerButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TimerButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        TimerButton.this.setEnabled(false);
        hHandler.sendEmptyMessage(1);
    }

    private Handler hHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (usrTime >= 0) {

                try {

                    TimerButton.this.setText(timerText + " " +" ("+ String.valueOf(usrTime)+")");
                    usrTime--;
                    Thread.sleep(interval);
                    hHandler.sendEmptyMessage(1);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                TimerButton.this.setEnabled(true);
                TimerButton.this.setText(timerText);

                if (completeListener != null) {
                    completeListener.onTimeCompleted();
                }

            }
        }
    };

    public void setFinishTime(int seconds) {
        this.usrTime = seconds;
    }

    public void setInterval(long milliseconds) {
        this.interval = milliseconds;
    }

    public void setTimerText(String text) {
        this.timerText = text;
    }

    //Called when the timer stops
    public interface onTimeCompleteListener {
        void onTimeCompleted();
    }
}
