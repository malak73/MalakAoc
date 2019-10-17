package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
ש
public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


    //1. proporties defenition
    EditText editTextEmail, editTextPassword, editTextPasswordConfirm, editTextName, editTextPhoneNumber ;
    Button  buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //2. initiallize proporties

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);




        buttonSignUp = findViewById(R.id.buttonSignUp);
        buttonSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            if (v == buttonSignUp) {
            if (editTextPassword.getText().toString().equals("")) {
                Toast.makeText(this, " Empty Password", Toast.LENGTH_LONG).show();

            } else {


                Intent i = new Intent(this, MainActivity.class);
                i.putExtra("email", editTextEmail.getText().toString());
                i.putExtra("password", editTextPassword.getText().toString());
                startActivity(i);
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



