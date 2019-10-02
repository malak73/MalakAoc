package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button signUp, logIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);

        logIn = findViewById(R.id.logIn);


    }

    @Override
    public void onClick(View v) {
        if (v == signUp) {
            Intent i = new Intent(this, SignUpActivity.class);
            startActivity(i);
        }

    }
}
