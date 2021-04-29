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

        FoodSumatera foodSumatera = getIntent().getParcelableExtra("foodSumatera_data");
        FoodSulawesi foodSulawesi = getIntent().getParcelableExtra("foodSulawesi_data");
        FoodJawa foodJawa = getIntent().getParcelableExtra("foodJawa_data");

        tvName.setText(foodSumatera.getName());
        tvDesc.setText(foodSumatera.getDesc());
        ivPhoto.setImageResource(foodSumatera.getPhoto());

        tvName.setText(foodSulawesi.getName());
        tvDesc.setText(foodSulawesi.getDesc());
        ivPhoto.setImageResource(foodSulawesi.getPhoto());

        tvName.setText(foodJawa.getName());
        tvDesc.setText(foodJawa.getDesc());
        ivPhoto.setImageResource(foodJawa.getPhoto());
    }
}
