package com.example.aplikasiberita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Bisnis extends AppCompatActivity implements View.OnClickListener{
    RecyclerView list_data;
    
    String []htmlFile = new String[]
            {
                    "bisnis1","bisnis2","bisnis3","bisnis4","bisnis5"
            };
    
    String s1[],s2[];
    int img[] = {R.drawable.bisnis11,R.drawable.bisnis2,R.drawable.bisnis3,R.drawable.bisnis4,R.drawable.bisnis5};
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        list_data = findViewById(R.id.list_data);

        s1 = getResources().getStringArray(R.array.judulB);
        s2 = getResources().getStringArray(R.array.deskripsiB);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, img, htmlFile);
        list_data.setAdapter(myAdapter);
        list_data.setLayoutManager(new LinearLayoutManager(this));

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        list_data.setLayoutManager(new
                GridLayoutManager(this, gridColumnCount));
    }

    @Override
    public void onClick(View v) {

    }
}
