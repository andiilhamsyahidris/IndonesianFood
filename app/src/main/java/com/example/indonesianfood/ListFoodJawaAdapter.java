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

public class ListFoodJawaAdapter extends RecyclerView.Adapter<ListFoodJawaAdapter.ListViewHolder> {
    private ArrayList<FoodJawa> listFood;

    public ListFoodJawaAdapter(ArrayList<FoodJawa> list) {
        this.listFood = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cvmodel, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final FoodJawa foodJawa = listFood.get(position);
        holder.imgPhoto.setImageResource(foodJawa.getPhoto());
        holder.tvName.setText(foodJawa.getName());
        holder.tvDesc.setText(foodJawa.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listFood.get(holder.getBindingAdapterPosition()));
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
    public interface OnItemClickCallback {
        void onItemClicked(FoodJawa data);
    }
}
