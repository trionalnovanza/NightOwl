package com.example.aplikasiberita;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView cardView,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView = (CardView)findViewById(R.id.cardView);
        cardView2 = (CardView)findViewById(R.id.cardView2);
        cardView3 = (CardView)findViewById(R.id.cardView3);
        cardView4 = (CardView)findViewById(R.id.cardView4);
        cardView5 = (CardView)findViewById(R.id.cardView5);
        cardView6 = (CardView)findViewById(R.id.cardView6);
        cardView7 = (CardView)findViewById(R.id.cardView7);

        try {
            cardView.setOnClickListener(this);
            cardView2.setOnClickListener(this);
            cardView3.setOnClickListener(this);
            cardView4.setOnClickListener(this);
            cardView5.setOnClickListener(this);
            cardView6.setOnClickListener(this);
            cardView7.setOnClickListener(this);
        }catch (NullPointerException ignored){

        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, com.example.aplikasiberita.AboutActivity.class));
        }
        if (item.getItemId()==R.id.saran){
            startActivity(new Intent(this, com.example.aplikasiberita.catatan.class));
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.cardView : i = new Intent(this,MainActivity2.class); startActivity(i);break;
            case R.id.cardView2 : i = new Intent(this,Politik.class); startActivity(i); break;
            case R.id.cardView3 : i = new Intent(this,Ekonomi.class); startActivity(i);break;
            case R.id.cardView4 : i = new Intent(this,Otomotif.class); startActivity(i); break;
            case R.id.cardView5 : i = new Intent(this,Bisnis.class); startActivity(i);break;
            case R.id.cardView6 : i = new Intent(this,Kesehatan.class); startActivity(i); break;
            case R.id.cardView7 : i = new Intent(this,Teknologi.class); startActivity(i);break;
            default:break;

        }
    }
}
