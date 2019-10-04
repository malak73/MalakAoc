package y2019.aoc.malak.malakaoc2019;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalInformationActivaty extends AppCompatActivity implements View.OnClickListener {

    Button chooseClub;
    String[]listItems;
    TextView personalInfotext;
    EditText editage, editarea, editJobType, editIntrestedArea, editSubject;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information_activaty);


         listItems = getResources().getStringArray(R.array.club_list);
         personalInfotext = findViewById(R.id.personalInfotext);
         editage=findViewById(R.id.editage);
         editarea =findViewById(R.id.editarea);
         editJobType=findViewById(R.id.editJobType);
         editIntrestedArea=findViewById(R.id.editIntrestedArea);
         editSubject=findViewById(R.id.editSubject);


         public void onClick (View v) {
             alertDialog.builder mBuilder=new AlertDialog.Builder(signUpActivaty.this);
             mBuilder.setTitle("CHOOSE AREA");
             mBuilder.setSingleChoiceItems(listItems, new DialogInterface().OnCancelListener() {

                 public void OnClick (dial)
            }
        }



    }






}
