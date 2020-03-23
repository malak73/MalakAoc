package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FIREBASE";
    Button signIn, logIn;
    MediaPlayer mMediaPlayer;
    private VideoView videoBG;
    int mCurrentVideoPosition;
    EditText editTextPassword, editTextEmail;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        videoBG = (VideoView) findViewById(R.id.videoView);
        signIn = findViewById(R.id.signIn);
        signIn.setOnClickListener(this);
        logIn = findViewById(R.id.logIn);
        logIn.setOnClickListener(this);
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextEmail.setOnClickListener(this);
        editTextPassword=findViewById(R.id.editTextPassword);
        editTextPassword.setOnClickListener(this);



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


            } else {
                login(editTextEmail.getText().toString(), editTextPassword.getText().toString());


            }
    }

}
    public void login(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i = new Intent(MainActivity.this, LogIn.class);
                            startActivity(i);

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(MainActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }
}
