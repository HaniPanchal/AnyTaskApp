package com.example.anytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        Button WorkButton , HireButton;

        WorkButton = findViewById(R.id.workBtn);
        HireButton = findViewById(R.id.hireBtn);

        WorkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(selection.this,MainActivity2.class);
                startActivity(intent);

            }
        });

        HireButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(selection.this,MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}