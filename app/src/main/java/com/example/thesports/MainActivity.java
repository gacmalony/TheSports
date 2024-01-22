package com.example.thesports;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Clicklistener {

    private RecyclerView recyclerView;

    private List<Model> sportlist;

    private CustomAdapter myadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        sportlist = new ArrayList<>();

        Model S1 = new Model("Football", R.drawable.football);
        sportlist.add(S1);
        Model S2 = new Model("Basketball", R.drawable.basketball);
        sportlist.add(S2);
        Model S3 = new Model("Volleyboll", R.drawable.volley);
        sportlist.add(S3);
        Model S4 = new Model("Tennis", R.drawable.tennis);
        sportlist.add(S4);

        myadapter = new CustomAdapter(sportlist);

        myadapter.setClicklistener(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);


    }

    @Override
    public Void onClick(View view, int pos) {
        Toast.makeText(this, "" + sportlist.get(pos).getTitle(), Toast.LENGTH_SHORT).show();
        return null;
    }

}
