package com.example.carpoolbuddy.ui.login;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.carpoolbuddy.R;



public class VehicleViewHolder extends RecyclerView.ViewHolder {


    protected Button moreButton;
    protected TextView vehicleModel;
    protected TextView vehicleCap;



    public VehicleViewHolder(@NonNull View itemView)
    {
        super(itemView);

        moreButton = itemView.findViewById(R.id.goToInfo);
        vehicleModel = itemView.findViewById(R.id.VehicleName);
        vehicleCap = itemView.findViewById(R.id.vehicleCap);



    }

}