package com.example.indonesianfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoodSumatera, rvFoodJawa, rvFoodSulawesi;
    private ArrayList<FoodJawa> listJawa = new ArrayList<>();
    private ArrayList<FoodSumatera> listSumatera = new ArrayList<>();
    private ArrayList<FoodSulawesi> listSulawesi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFoodSumatera = findViewById(R.id.rvFoodSumatera);
        rvFoodJawa = findViewById(R.id.rvJawa);
        rvFoodSulawesi = findViewById(R.id.rvSulawesi);

        rvFoodSumatera.setHasFixedSize(true);
        rvFoodJawa.setHasFixedSize(true);
        rvFoodSulawesi.setHasFixedSize(true);

        listSumatera.addAll(FoodDataSumatera.getListData());
        listJawa.addAll(FoodDataJawa.getListData());
        listSulawesi.addAll(FoodDataSulawesi.getListData());

        showRecyclerList();

    }
    private void showRecyclerList() {
        rvFoodSumatera.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ListFoodSumateraAdapter listFoodSumateraAdapter = new ListFoodSumateraAdapter(listSumatera);
        rvFoodSumatera.setAdapter(listFoodSumateraAdapter);

        rvFoodJawa.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ListFoodJawaAdapter listFoodJawaAdapter = new ListFoodJawaAdapter(listJawa);
        rvFoodJawa.setAdapter(listFoodJawaAdapter);

        rvFoodSulawesi.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ListFoodSulawesiAdapter listFoodSulawesiAdapter = new ListFoodSulawesiAdapter(listSulawesi);
        rvFoodSulawesi.setAdapter(listFoodSulawesiAdapter);
    }
}
