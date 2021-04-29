package com.example.indonesianfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView rvFoodSumatera, rvFoodJawa, rvFoodSulawesi;
    private ArrayList<FoodJawa> listJawa = new ArrayList<>();
    private ArrayList<FoodSumatera> listSumatera = new ArrayList<>();
    private ArrayList<FoodSulawesi> listSulawesi = new ArrayList<>();

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvFoodSumatera = view.findViewById(R.id.rvFoodSumatera);
        rvFoodJawa = view.findViewById(R.id.rvJawa);
        rvFoodSulawesi = view.findViewById(R.id.rvSulawesi);
        rvFoodSumatera.setHasFixedSize(true);
        rvFoodJawa.setHasFixedSize(true);
        rvFoodSulawesi.setHasFixedSize(true);

        listSumatera.addAll(FoodDataSumatera.getListData());
        listJawa.addAll(FoodDataJawa.getListData());
        listSulawesi.addAll(FoodDataSulawesi.getListData());

        showRecyclerList();
        return view;
    }
    private void showRecyclerList() {
        rvFoodSumatera.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        ListFoodSumateraAdapter listFoodSumateraAdapter = new ListFoodSumateraAdapter(listSumatera);
        rvFoodSumatera.setAdapter(listFoodSumateraAdapter);
        listFoodSumateraAdapter.setOnItemClickCallback(new ListFoodSumateraAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(FoodSumatera data) {
                Intent intent = new Intent(getActivity(), DetailFood.class);
                intent.putExtra("foodSumatera_data", data );
                startActivity(intent);
            }
        });

        rvFoodJawa.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        ListFoodJawaAdapter listFoodJawaAdapter = new ListFoodJawaAdapter(listJawa);
        rvFoodJawa.setAdapter(listFoodJawaAdapter);
        listFoodJawaAdapter.setOnItemClickCallback(new ListFoodJawaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(FoodJawa data) {
                Intent intent = new Intent (getActivity(), DetailFood.class);
                intent.putExtra("foodJawa_data", data);
                startActivity(intent);
            }
        });

        rvFoodSulawesi.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        ListFoodSulawesiAdapter listFoodSulawesiAdapter = new ListFoodSulawesiAdapter(listSulawesi);
        rvFoodSulawesi.setAdapter(listFoodSulawesiAdapter);
        listFoodSulawesiAdapter.setOnItemClickCallback(new ListFoodSulawesiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(FoodSulawesi data) {
                Intent intent = new Intent(getActivity(), DetailFood.class);
                intent.putExtra("foodSulawesi_data", data);
                startActivity(intent);
            }
        });
    }
}
