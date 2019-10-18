package y2019.aoc.malak.malakaoc2019;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalInformationActivity extends AppCompatActivity implements View.OnClickListener {

    Button  findJob;
    TextView personalInfotext;
    EditText editage, editarea, editJobType, editIntrestedArea, editSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information_activaty);


        personalInfotext = findViewById(R.id.personalInfotext);
        editage = findViewById(R.id.editage);
        editarea = findViewById(R.id.editarea);
        editJobType = findViewById(R.id.editJobType);
        editIntrestedArea = findViewById(R.id.editIntrestedArea);
        editSubject = findViewById(R.id.editSubject);

        findJob = findViewById(R.id.buttonFindJob);
        findJob.setOnClickListener(this);

    }
        public void onClick(View v) {
            if (v == findJob) {
                Intent i = new Intent(this, SignUpActivity.class);
                startActivity(i);

                startActivity(i);

            }


        }






}
