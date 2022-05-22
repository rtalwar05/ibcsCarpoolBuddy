package com.example.carpoolbuddy.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.carpoolbuddy.CISUser;
import com.example.carpoolbuddy.R;
import com.example.carpoolbuddy.Vehicle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;


/**
 * This activity allows the user to see a list of all of their own vehicles.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */

public class VehiclesInfoActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser FBuser;
    FirebaseFirestore firestore;
    Vehicle vehicleInfo;
    public ArrayList<Vehicle> vehiclesList;

    CISUser user;
    Vehicle currCar;

    //RecyclerView recView;

    public ArrayList<String> userVehicles;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles_info);

        mAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        FBuser = mAuth.getCurrentUser();
        //recView = findViewById(R.id.recView);


//        firestore.collection("users").document("students").collection("y12").document(FBuser.getUid()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//            @Override
//            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                if (task.isSuccessful()) {
//                    DocumentSnapshot ds = task.getResult();
//                    user = ds.toObject(CISUser.class);
//
//                    userVehicles = user.getOwnedVehicles();
//
//                    System.out.println (user.getName());
//                } else
//                    {
//                        Log.d("ERROR","Get User" );
//
//                }
//            }
//        });


//        for (String v : userVehicles) {
//
//            firestore.collection("vehicles").document("car").collection("4").document(v).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
//                @Override
//                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
//                    if (task.isSuccessful()) {
//                        DocumentSnapshot ds = task.getResult();
//                        currCar = ds.toObject(Vehicle.class);
//
//                        vehiclesList.add(currCar);
//
//                    } else {
//
//
//                    }
//
//
//                }
//
//            });
//        }

//        ArrayList <String> modelNames = new ArrayList<>();
//        ArrayList <String> prices = new ArrayList<>();
//
//        for (Vehicle v : vehiclesList)
//        {
//            modelNames.add(v.getModel());
//            prices.add(String.valueOf(v.getBasePrice()));
//        }


//        VehicleRecyclerViewAdapter adapter = new VehicleRecyclerViewAdapter(modelNames, prices);
//        recView.setAdapter(adapter);
//        recView.setLayoutManager(new LinearLayoutManager(this ));

    }


    /**
     * This method allows the user to go to the screen where they can add a vehicle
     * @param v
     */


    public void goToAddVehicle(View v){
        Intent intent = new Intent(this, addVehicleActivity.class);
        startActivity(intent);

    }

    /**
     * This method allows the user to go to their profile page.
     * @param v
     */

    public void goToProfile (View v){
        Intent intent = new Intent(this, UserProfileActivity.class);
        startActivity(intent);
    }

}