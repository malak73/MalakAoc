package y2019.aoc.malak.malakaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListOfJobs extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<String> arrayList= new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_jobs);

        listView=(ListView)findViewById(R.id.listView);

        arrayList.add("Hospitality");
        arrayList.add("tourism");
        arrayList.add("Architect");
        arrayList.add("Animal Trainer");
        arrayList.add("Athletic Trainer");
        arrayList.add("Choreographer");
        arrayList.add("Economist Jobs");
        arrayList.add("Answering Service Jobs");
        arrayList.add("Computer Hardware Engineer Jobs");
        arrayList.add("Cook Jobs");
        arrayList.add("Designer Jobs");
        arrayList.add("Detective Jobs");
        arrayList.add("Education Teacher Jobs");
        arrayList.add("Fashion Designer Jobs");
        arrayList.add("Fashion Model Jobs");
        arrayList.add("Economist Jobs");
        arrayList.add("Food Servers Jobs");
        arrayList.add("House Cleaner Jobs");
        arrayList.add("Housekeeper Jobs");
        arrayList.add("Marine Engineer Jobs");
        arrayList.add("Mathematician Jobs");
        arrayList.add("Painter Jobs");
        arrayList.add(" Accountant Jobs");
        arrayList.add("Athletes and Sports Competitor Jobs");
        arrayList.add("Concierge Jobs");
        arrayList.add("Dentist Jobs");
        arrayList.add("Computer Hardware Engineer Jobs");
        arrayList.add("Editor Jobs");
        arrayList.add("Infantry Jobs");
        arrayList.add("Lawyer Jobs");
        arrayList.add("Librarian Jobs");
        arrayList.add("Lifeguard Jobs");
        arrayList.add("Musician Jobs");
        arrayList.add("Nutritionist Jobs");
        arrayList.add("Nursing Aide Jobs");
        arrayList.add("Pharmacist Jobs");



        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListOfJobs.this, "choose job" + position +" "+arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
    }
}

