package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signUp, logIn;
    MediaPlayer mMediaPlayer;
    private VideoView videoBG;
    int mCurrentVideoPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoBG =(VideoView)findViewById(R.id.videoView);
        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        logIn = findViewById(R.id.logIn);


        Uri uri= Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.welcomevideo);
        videoBG.setVideoURI(uri);
        videoBG.start();

        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mMediaPlayer = mp;

                        mMediaPlayer.setLooping(true);

                        if (mCurrentVideoPosition != 0){
                            mMediaPlayer.seekTo((mCurrentVideoPosition));
                            mMediaPlayer.start();
                        }
                    }

        });
    }
    @Override
    protected void onPause(){
    super.onPause();
    mCurrentVideoPosition =mMediaPlayer.getCurrentPosition();
    videoBG.pause();

        }
        @Override
        protected  void onResume(){
        super.onResume();
         videoBG.start();
        }

        @Override
        protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer=null;
        }

    @Override
    public void onClick(View v) {
        if (v == signUp) {
            Intent i = new Intent(this, AccountTypeActivity.class);
            startActivity(i);
        }
        if (v == logIn) {
            Intent i=new Intent(this, LogInActivity.class);
            startActivity(i);
}
    }
}
