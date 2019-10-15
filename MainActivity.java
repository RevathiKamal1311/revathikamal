package com.example.loginpage;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    Button LoginButton;
    EditText Username, Password ;
    DbHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton = (Button) findViewById(R.id.button3);
        Username = (EditText) findViewById(R.id.editText3);
        Password = (EditText) findViewById(R.id.editText4);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name=Username.getText().toString();
                String password=Password.getText().toString();
                int id= checkUser(new User(name,password));
                if(id==-1)
                {
                    Toast.makeText(MainActivity.this,"Invalid Login Credentials!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Success! "+name,Toast.LENGTH_LONG).show();
                }
                db=new DbHandler(MainActivity.this);
                db.addUser(new User("Admin", "Admin"));
                db.addUser(new User("User", "User"));
                db.addUser(new User("Tom", "Password"));
            }
            public int checkUser(User user)
            {
                return db.checkUser(user);
            }
        });




    }
}
