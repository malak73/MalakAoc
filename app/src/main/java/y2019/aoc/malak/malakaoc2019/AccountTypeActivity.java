package y2019.aoc.malak.malakaoc2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccountTypeActivity extends AppCompatActivity implements View.OnClickListener {


    Button btPersonalAccount, btBuisnessAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);

        btBuisnessAccount = findViewById(R.id.btBuisnessAccount);
        btBuisnessAccount.setOnClickListener(this);

        btPersonalAccount = findViewById(R.id.btPersonalAccount);
        btPersonalAccount.setOnClickListener(this);

    }
    public void onClick(View v) {
        if (v == btBuisnessAccount) {
            Intent i = new Intent(this, BusinessAccountActivity.class);
            startActivity(i);
        }
        if (v == btPersonalAccount) {
            Intent i = new Intent(this, PersonalInformationActivity.class);
            startActivity(i);
        }
    }}