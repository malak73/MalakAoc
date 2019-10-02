package y2019.aoc.malak.malakaoc2019;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersonalInformationActivaty extends AppCompatActivity implements View.OnClickListener {

    Button chooseClub;
    String[]listItems;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_information_activaty);

        listItems = getResources().getStringArray(R.array.club_list);

        
    }






}
