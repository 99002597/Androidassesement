package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WinnersActivity extends AppCompatActivity {
    RecyclerView winnersRecyclerView;
    String s1[],s2[];
    int images[]={R.drawable.fashion,
            R.drawable.computer,
            R.drawable.cars,
            R.drawable.fitness,
            R.drawable.foods};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners);
        winnersRecyclerView = findViewById(R.id.winnersRecyclerView);
        s1 = getResources().getStringArray(R.array.Winners_List);
        s2 = getResources().getStringArray(R.array.Description);
        WinnersAdapter winnersAdapter=new WinnersAdapter(this,s1,s2,images);
        winnersRecyclerView.setAdapter(winnersAdapter);
        winnersRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
