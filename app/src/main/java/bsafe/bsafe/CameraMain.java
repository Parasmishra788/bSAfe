package bsafe.bsafe;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class CameraMain extends AppCompatActivity {

    private static int Video_req = 101;
    private Uri videoUri = null;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_camera_main);

        CaptureVideo(view);
    }

    public void CaptureVideo(View view) {
        Intent videoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
         if(videoIntent.resolveActivity(getPackageManager())!=null)
         {
             startActivityForResult(videoIntent,Video_req);
         }



    }

   public void viu(View view) {
        Intent playIndent = new Intent(this, VideoPlayActivity.class);
        playIndent.putExtra("videoUri",videoUri.toString());
        startActivity(playIndent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==Video_req && resultCode==RESULT_OK)
        {
            videoUri=data.getData();

        }
    }
}
