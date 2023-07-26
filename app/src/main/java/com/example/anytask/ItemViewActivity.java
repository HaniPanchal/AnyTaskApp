package com.example.anytask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemViewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    ItemsModel itemsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_view);

        imageView = findViewById(R.id.imageViewItem);
        textView = findViewById(R.id.tectViewName);

        Intent intent = getIntent();

        if (intent.getExtras() != null){
            itemsModel = (ItemsModel) intent.getSerializableExtra("item");

            imageView.setImageResource(itemsModel.getImg());
            textView.setText(itemsModel.getName());
        }
    }
}