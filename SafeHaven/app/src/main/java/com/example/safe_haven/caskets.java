package com.example.safe_haven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class caskets extends AppCompatActivity {
ImageView b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_caskets);

        Button inquire = findViewById(R.id.inquire);
        inquire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(caskets.this, contacts.class);
                Toast.makeText(caskets.this, "Press The Green Button to make a Call", Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });
        ImageView b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(caskets.this, service.class);
                startActivity(intent);
            }
        });


    }
}