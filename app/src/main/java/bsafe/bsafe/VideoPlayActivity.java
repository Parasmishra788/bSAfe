package bsafe.bsafe;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoPlayActivity extends AppCompatActivity {
    private VideoView mVideoView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mVideoView = findViewById(R.id.VideoView);
        Uri videoUri = Uri.parse(getIntent().getExtras().getString("videoUri"));
       // mVideoView.setVideoURI(videoUri);
       // mVideoView.start();
        intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }

}