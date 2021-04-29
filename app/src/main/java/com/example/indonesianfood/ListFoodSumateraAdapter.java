package com.example.indonesianfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFoodSumateraAdapter extends RecyclerView.Adapter<ListFoodSumateraAdapter.ListViewHolder> {
    private ArrayList<FoodSumatera> listFood;

    public ListFoodSumateraAdapter(ArrayList<FoodSumatera> list) {
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
        final FoodSumatera foodSumatera = listFood.get(position);
        holder.imgPhoto.setImageResource(foodSumatera.getPhoto());
        holder.tvName.setText(foodSumatera.getName());
        holder.tvDesc.setText(foodSumatera.getDesc());

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
        void onItemClicked(FoodSumatera data);
    }
}
