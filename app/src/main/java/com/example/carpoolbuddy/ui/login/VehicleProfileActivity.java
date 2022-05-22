package com.example.carpoolbuddy.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.carpoolbuddy.R;
import com.example.carpoolbuddy.Vehicle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.*;

public class VehicleProfileActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser user;
    Vehicle vehicleInfo;

    EditText model;
    EditText type;
    EditText cap;
    EditText price;

    CheckBox open;
    CheckBox green;

    protected ArrayList<Vehicle> bookedHistory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_profile);


        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();

        model.setText(vehicleInfo.getModel());
        type.setText(vehicleInfo.getVehicleType());
        cap.setText(vehicleInfo.getCapacity());
        price.setText(String.valueOf(vehicleInfo.getBasePrice()));

        if (vehicleInfo.isOpen())
        {
            open.setChecked(true);
        }

        if (vehicleInfo.getIsGreen())
        {
            green.setChecked(true);
        }

        if(!open.isChecked())
        {
            vehicleInfo.setOpen(false);

        }

    }

    public void bookRide(View v)
    {

        vehicleInfo.setCapacity(vehicleInfo.getCapacity()-1);

        bookedHistory.add(vehicleInfo);

        ArrayList<String> riders;

        riders = vehicleInfo.getRidersUID();
        riders.add(user.getUid());

        vehicleInfo.setRidersUID(riders);

    }






}