package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;
    private TextView error;
    String user,pass,user1,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.button);
        error = (TextView) findViewById(R.id.textView2);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("nasreenbanuak@gmail.com") && password.getText().toString().equals("nasreen"))
                    setContentView(R.layout.home_screen);
                else
                    error.setText("Username or Password doesn't match!");
            }
        });
    }
}