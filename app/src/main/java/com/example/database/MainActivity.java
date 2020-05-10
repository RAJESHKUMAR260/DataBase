package com.example.database;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       DatabaseHelper databaseHelper = new DatabaseHelper(MainActivity.this,"Mydatabase",null,5);

       Temp.setDatabaseHelper(databaseHelper);
       b1 = (Button)findViewById(R.id.button);
       b2 = (Button)findViewById(R.id.button2);
       b3= (Button)findViewById(R.id.button3);
       b4=(Button)findViewById(R.id.button4);

       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,InsertUser.class));
               finish();

           }
       });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
