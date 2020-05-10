package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertUser extends AppCompatActivity {
    EditText t1, t2, t3, t4;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_user);
        t1 = findViewById(R.id.editText);
        t2 = findViewById(R.id.editText2);
        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText4);
        databaseHelper = Temp.getDatabaseHelper();

    }

    public void Save(View view) {

        String id = t1.getText().toString();
        String name = t2.getText().toString();
        String email = t3.getText().toString();
        String phone = t4.getText().toString();

        if (id.equals("") || name.equals("") || email.equals("")||phone.equals("")) {
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
        } else {
            User user = new User();
            User.setId(id);
            User.setName(name);
            User.setEmail(email);
            User.setPhone(phone);
            int i = databaseHelper.insertUser(user);
            if (i == 1) {
                Toast.makeText(this, "User data inserted", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this,"User data not inserted",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
