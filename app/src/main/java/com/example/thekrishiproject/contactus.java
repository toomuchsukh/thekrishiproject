package com.example.thekrishiproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class contactus extends AppCompatActivity{

    private Button bts;
    private TextView tv1,tv2,tv3;
    EditText user,story;
    private DatabaseReference ref;
    User uu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        tv1=(TextView)findViewById(R.id.contv);
        tv2=(TextView)findViewById(R.id.emph);
        tv3=(TextView)findViewById(R.id.story);
        user=(EditText) findViewById(R.id.ed1);
        story=(EditText) findViewById(R.id.ed2);
        bts=(Button) findViewById(R.id.sharebt);
        ref=FirebaseDatabase.getInstance().getReference().child("User");
        uu=new User();

        bts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtuser=user.getText().toString();
                String txtstory=story.getText().toString();

                if(txtuser.isEmpty()|| txtstory.isEmpty()) {
                    Toast.makeText(contactus.this, "Please fill in all spaces", Toast.LENGTH_SHORT).show();
                }else {
                    uu.setTxtuser(txtuser);
                    uu.setTxtstory(txtstory);
                    ref.push().setValue(uu);
                    Toast.makeText(contactus.this, "Message Received :)", Toast.LENGTH_SHORT).show();

                }
            }



        });

    }


}