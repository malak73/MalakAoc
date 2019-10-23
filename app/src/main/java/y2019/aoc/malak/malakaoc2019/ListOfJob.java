package y2019.aoc.malak.malakaoc2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfJob extends AppCompatActivity {

    ArrayList<Jobs> job;
    ListView JobListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_job);

        JobListView = findViewById(R.id.JobListView);
        job = new ArrayList<>();


  /*      job.add(new Item(R.drawable.download, "name"));
        job.add(new Item(R.drawable.download, "area"));
        job.add(new Item(R.drawable.download, "find a job"));*/


    }
}
