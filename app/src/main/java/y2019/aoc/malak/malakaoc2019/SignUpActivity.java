package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


    //1. proporties defenition
    EditText editTextEmail, editTextPassword, editTextPasswordConfirm, editTextName, editTextPhoneNumber ;
    Button  buttonSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);




        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

    public void signUp(String email, String password){
        mAuth.createUserWithEmailAndPassword(email , password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d("FirebaseAuth", "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                            i.putExtra("email", editTextEmail.getText().toString());
                            i.putExtra("password", editTextPassword.getText().toString());
                            startActivity(i);
                            // Sign in success, update UI with the signed-in user's information

                            //updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("FirebaseAuth", "createUserWithEmail:failure", task.getException());
                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            //updateUI(null);
                        }
                        
                        // ...
                    }
                });
    }
    @Override
    public void onClick(View v) {
        if (v == buttonSignUp) {

            if (editTextPassword.getText().toString().equals("")) {
                Toast.makeText(this, " Empty Password", Toast.LENGTH_LONG).show();

            } else {

                signUp(editTextEmail.getText().toString(), editTextPassword.getText().toString());

            }
            if (editTextEmail.getText().toString().equals("")){
                Toast.makeText(this, " Empty Email", Toast.LENGTH_LONG).show();
            }

            if (editTextPasswordConfirm.getText().toString().equals("")||!editTextPasswordConfirm.getText().toString().equals(editTextPassword)
            ) {
                Toast.makeText(this, "confirm password ןs empty or wrong", Toast.LENGTH_LONG).show();
            }

            if (editTextName.getText().toString().equals("")){
                Toast.makeText(this, "write your name", Toast.LENGTH_LONG).show();
            }
            if (editTextPhoneNumber.getText().toString().equals("")){
                Toast.makeText(this, " Empty phone Number", Toast.LENGTH_LONG).show();
            }

        } else {

            if (v == buttonSignUp){
                Intent i = new Intent( this, MainActivity.class);
                startActivity(i);

            }


        }
    }
}



