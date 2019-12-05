package y2019.aoc.malak.malakaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfJobs extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_jobs);

        listView=(ListView)findViewById(R.id.listView);

        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Hospitality");
        arrayList.add("tourism");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.onItemClickListener() {

        }}

    }
}
