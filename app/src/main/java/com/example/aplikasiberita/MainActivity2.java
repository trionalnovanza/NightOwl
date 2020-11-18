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

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    RecyclerView list_data;
    
    String []htmlFile = new String[]
            {
                    "chap1","chap2","chap3","chap4","chap5","chap6","chap7"
            };
    
    String s1[],s2[];
    int img[] = {R.drawable.pendidikan,R.drawable.politik,R.drawable.ekonomi,R.drawable.otomotif,R.drawable.bisnis,R.drawable.kesehatan,R.drawable.teknologi};
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        list_data = findViewById(R.id.list_data);

        s1 = getResources().getStringArray(R.array.judul);
        s2 = getResources().getStringArray(R.array.deskripsi);

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
