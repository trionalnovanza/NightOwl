package com.example.aplikasiberita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView list_data;

    String s1[],s2[];
    int img[] = {R.drawable.bunga,R.drawable.kota,R.drawable.ruangan,R.drawable.kebun,R.drawable.otomotif};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_data = findViewById(R.id.list_data);

        s1 = getResources().getStringArray(R.array.judul);
        s2 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, img);
        list_data.setAdapter(myAdapter);
        list_data.setLayoutManager(new LinearLayoutManager(this));
    }
}