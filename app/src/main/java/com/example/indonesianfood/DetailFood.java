package com.example.indonesianfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);

        TextView tvName = findViewById(R.id.tvNameDetail);
        TextView tvDesc = findViewById(R.id.tvDescDetail);
        ImageView ivPhoto = findViewById(R.id.imgDetailFood);

        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");
        int photo = getIntent().getIntExtra("photo", 0);

        ivPhoto.setImageResource(photo);
        tvName.setText(name);
        tvDesc.setText(desc);
    }
}
