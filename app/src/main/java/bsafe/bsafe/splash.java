package bsafe.bsafe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    Intent intent;
    ActivityOptions activityOptions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        intent=new Intent(this,MainActivity.class);
        activityOptions= ActivityOptions.makeCustomAnimation(this,android.R.anim.fade_in, android.R.anim.fade_out);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try
                {
                    Thread.sleep(1500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent,activityOptions.toBundle());
                    finish();
                }
            }
        });
        thread.start();
    }
}
