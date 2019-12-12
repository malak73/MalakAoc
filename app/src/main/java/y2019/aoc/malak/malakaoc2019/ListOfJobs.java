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
        arrayList.add("");
        arrayList.add("");
        arrayList.add("");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListOfJobs.this, "choose job" + position +" "+arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
    }
}

