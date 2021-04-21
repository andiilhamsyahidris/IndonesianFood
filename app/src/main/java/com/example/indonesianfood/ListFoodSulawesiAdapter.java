package com.example.indonesianfood;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFoodSulawesiAdapter extends RecyclerView.Adapter<ListFoodSulawesiAdapter.ListViewHolder> {
    private ArrayList<FoodSulawesi> listFood;

    public ListFoodSulawesiAdapter(ArrayList<FoodSulawesi> list) {
        this.listFood = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cvmodel, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final FoodSulawesi foodSulawesi = listFood.get(position);
        holder.imgPhoto.setImageResource(foodSulawesi.getPhoto());
        holder.tvName.setText(foodSulawesi.getName());
        holder.tvDesc.setText(foodSulawesi.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(holder.itemView.getContext(), DetailFood.class);
                intent.putExtra("name", foodSulawesi.getName());
                intent.putExtra("photo", foodSulawesi.getPhoto());
                intent.putExtra("desc", foodSulawesi.getDesc());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName, tvDesc;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.imageFood);
            tvName = itemView.findViewById(R.id.foodName);
            tvDesc = itemView.findViewById(R.id.foodDesc);
        }
    }
}
