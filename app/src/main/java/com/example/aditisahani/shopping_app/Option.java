package com.example.aditisahani.shopping_app;

import android.content.Intent;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Option extends AppCompatActivity {

    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        b1=(Button)findViewById(R.id.sign);
        b2=(Button)findViewById(R.id.create);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Option.this,Login.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Option.this,Register.class);
                startActivity(i2);
            }
        });
        }
}
