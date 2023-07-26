package com.example.anytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText email,password;
        Button AnyTask;
        CheckBox checkbox;

        email = findViewById(R.id.emailTxt);
        password = findViewById(R.id.passwordTxt);
        checkbox = findViewById(R.id.checkBox);


        AnyTask = findViewById(R.id.joinAnyTaskBtn);



        AnyTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || !checkbox.isChecked()) {
                    Toast.makeText(SignUp.this, "please enter details", Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().equals("hani")&& password.getText().toString().equals("hani123") && checkbox.isChecked()){
                    Toast.makeText(SignUp.this, "Sign Up sucess", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp.this,selection.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SignUp.this, "error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}