package com.example.thekrishiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView cardvidya, cardchitta,cardofpc,cardvendors,carddonate,cardcattle;
    public Button jb,contb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        jb=(Button)findViewById(R.id.joinbt);
        jb.setOnClickListener(this);
        contb=(Button)findViewById(R.id.contbt);
        contb.setOnClickListener(this);

        cardvidya = (CardView) findViewById(R.id.cardvidya);
        cardchitta = (CardView) findViewById(R.id.cardchitta);
        cardofpc = (CardView) findViewById(R.id.cardofpc);
        cardvendors = (CardView) findViewById(R.id.cardvendors);
        carddonate= (CardView) findViewById(R.id.carddonate);
        cardcattle = (CardView) findViewById(R.id.cardcattle);

        cardvidya.setOnClickListener(this);
        cardchitta.setOnClickListener(this);
        cardofpc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){

            case R.id.joinbt:
                i= new Intent(this,joinuspage.class);
                startActivity(i);
                break;

            case R.id.contbt:
                i= new Intent(this,contactus.class);
                startActivity(i);
                break;

            case R.id.cardvidya:
                i= new Intent(this,vidya.class);
                startActivity(i);
                break;

            case R.id.cardchitta:
                i=new Intent(this, chitta.class);
                startActivity(i);
                break;

            case R.id.cardofpc:
                i= new Intent(this, ofpc.class);
                startActivity(i);

        }

    }
}