package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signIn, logIn;
    MediaPlayer mMediaPlayer;
    private VideoView videoBG;
    int mCurrentVideoPosition;
    EditText editTextPassword, editTextEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        videoBG = (VideoView) findViewById(R.id.videoView);
        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(this);
        logIn = findViewById(R.id.logIn);
        logIn.setOnClickListener(this);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.welcomevideo);
        videoBG.setVideoURI(uri);
        videoBG.start();

        videoBG.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mMediaPlayer = mp;

                mMediaPlayer.setLooping(true);

                if (mCurrentVideoPosition != 0) {
                    mMediaPlayer.seekTo((mCurrentVideoPosition));
                    mMediaPlayer.start();
                }
            }

        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();
        videoBG.pause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        videoBG.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }


    @Override
    public void onClick(View v) {
        if (v == signIn) {
            Intent i = new Intent(this, AccountTypeActivity.class);
            startActivity(i);
        }


        if (v == logIn) {
            if (editTextPassword.getText().toString().equals("") || editTextEmail.getText().toString().equals("")) {
                Toast.makeText(this, " Empty Password or Email", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, LogIn.class);

            } else {


                Intent i = new Intent(this, AccountTypeActivity.class);
                i.putExtra("email", editTextEmail.getText().toString());
                i.putExtra("password", editTextPassword.getText().toString());
                startActivity(i);

            }
    }
}}
