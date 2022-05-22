package com.example.carpoolbuddy.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carpoolbuddy.R;

import java.util.ArrayList;

public class VehicleRecyclerViewAdapter extends RecyclerView.Adapter<VehicleViewHolder> {

    ArrayList<String> mData;
    ArrayList<String> oData;



    public VehicleRecyclerViewAdapter(ArrayList<String> mData, ArrayList<String> oData) {
        this.mData = mData;
        this.oData = oData;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.vehicle_row_view, parent, false);

        VehicleViewHolder holder = new VehicleViewHolder(myView);



        return holder;


    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {

        holder.vehicleModel.setText(mData.get(position));
        holder.vehicleCap.setText( "4");



    }

    @Override
    public int getItemCount() {
        return 0;
    }


}