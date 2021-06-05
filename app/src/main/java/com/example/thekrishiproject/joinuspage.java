package com.example.thekrishiproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class joinuspage extends AppCompatActivity {
    private TextView t1,t2,t3;
    private EditText e1,e2;
    private Button b1;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinuspage);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        t1=(TextView)findViewById(R.id.regtv);
        t2=(TextView)findViewById(R.id.nametv);
        t3=(TextView)findViewById(R.id.phonetv);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        b1=(Button) findViewById(R.id.joinb);

        auth= FirebaseAuth.getInstance();

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
              String txtemail=e1.getText().toString();
              String txtpass=e2.getText().toString();

              if(TextUtils.isEmpty(txtemail )|| TextUtils.isEmpty(txtpass)) {
                  Toast.makeText(joinuspage.this, "Empty Credentials", Toast.LENGTH_SHORT).show();
              }
              else if(txtpass.length()<6){
                  Toast.makeText(joinuspage.this, "Password too short", Toast.LENGTH_SHORT).show();
              }else{
                  registerUser(txtemail,txtpass);
              }

            }
        });
    }

    private void registerUser(String e1, String e2) {
        auth.createUserWithEmailAndPassword(e1,e2).addOnCompleteListener(joinuspage.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(joinuspage.this, "Welcome here", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(joinuspage.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}