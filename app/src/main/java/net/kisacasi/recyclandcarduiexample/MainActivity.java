package net.kisacasi.recyclandcarduiexample;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Medicine> medicineArrayList;
    private CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final SearchView searchView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView)findViewById(R.id.searchView);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.setIconified(false);
            }
        });


        rv = (RecyclerView)findViewById(R.id.recyclViewModel);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        //LinearLayoutManager llm = new LinearLayoutManager(this);
        //rv.setLayoutManager(llm);

        Medicine medicine1=new Medicine("Vitamin Pill",19.99,"vitamin_pill");
        Medicine medicine2=new Medicine("Omega 3 Pills",21.99,"omega_3");
        Medicine medicine3=new Medicine("Medobi-M",19.99,"herbalife_thermo_complete");
        Medicine medicine4=new Medicine("Solgar Biotin",21.99,"omega_3");
        Medicine medicine5=new Medicine("Growth Factor 9",19.99,"vitamin_pill");
        Medicine medicine6=new Medicine("Omega 3 Hapı 3",21.99,"omega_3");

        medicineArrayList=new ArrayList<>();
        medicineArrayList.add(medicine1);
        medicineArrayList.add(medicine2);
        medicineArrayList.add(medicine3);
        medicineArrayList.add(medicine4);
        medicineArrayList.add(medicine5);
        medicineArrayList.add(medicine6);

        adapter=new CustomAdapter(this,medicineArrayList);
        rv.setAdapter(adapter);


    }
}
