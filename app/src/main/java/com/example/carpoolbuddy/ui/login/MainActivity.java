package com.example.carpoolbuddy.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.carpoolbuddy.R;
import com.example.carpoolbuddy.Vehicle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

/**
This Activity allows the user to see which cars are available to the user for them to book. There are also buttons that direct the
* user to their profile or their vehicles
*  @author: Rhea Talwar
 *  @version: 1
*
*
* */

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser FBuser;
    FirebaseFirestore firestore;

    RecyclerView recView;

    ArrayList<Vehicle> allOpenVehicles = new ArrayList<>();
    ArrayList<String> ovNames = new ArrayList<>();
    ArrayList<String> ovPrice = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recView = findViewById(R.id.recView);

        mAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        FBuser = mAuth.getCurrentUser();

//        populateRecView();
//
//        VehicleRecyclerViewAdapter adapter = new VehicleRecyclerViewAdapter(ovNames,ovPrice);
//        recView.setAdapter(adapter);
//        recView.setLayoutManager(new LinearLayoutManager(this));
    }


    /**
     * This method changes the UI screen from the main screen to the User's profile.
     * @param v
     */

    public void goToProfile (View v) {
        Intent intent = new Intent(this, UserProfileActivity.class);
        startActivity(intent);
    }

    public void populateRecView()
    {
        firestore.collection("vehicles").document("cars").collection("4")
                .whereEqualTo("open", true)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d("Success", document.getId() + " => " + document.getData());
                                Vehicle v = document.toObject(Vehicle.class);
                                allOpenVehicles.add(v);

                            }
                        } else {
                            Log.d("Error", "Error getting documents: ", task.getException());
                        }
                    }
                });

        for (Vehicle v : allOpenVehicles)
        {
            ovNames.add(v.getModel());
            ovPrice.add(String.valueOf(v.getBasePrice()));

            System.out.println("VMODEL:" + v.getModel());
        }
    }




    /**
     * This method changes the UI screen from the main screen to the User's vehicles.
     * @param v
     */

    public void goToVehicles (View v){
        Intent intent = new Intent(this, VehiclesInfoActivity.class);
        startActivity(intent);
    }



}