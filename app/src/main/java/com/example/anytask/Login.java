package com.example.anytask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText email,password;
        Button login;


        email = findViewById(R.id.emailTxt);
        password = findViewById(R.id.passwordTxt);



        login = findViewById(R.id.loginBtn);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty() ) {
                    Toast.makeText(Login.this, "please enter details", Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().equals("hani")&& password.getText().toString().equals("hani123")){
                    Toast.makeText(Login.this, "login  sucess", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(Login.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}