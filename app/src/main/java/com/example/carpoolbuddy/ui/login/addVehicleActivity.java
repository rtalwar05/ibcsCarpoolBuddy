package com.example.carpoolbuddy.ui.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.carpoolbuddy.CISUser;
import com.example.carpoolbuddy.R;
import com.example.carpoolbuddy.Vehicle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;
import java.util.UUID;

/**
 * This activity allows the user to add a new vehicle that belongs to them.
 *
 * @author rheatalwar
 * @version 1
 *
 */


public class addVehicleActivity extends AppCompatActivity {


    FirebaseFirestore firestore;
    FirebaseUser mUser;
    FirebaseAuth mAuth;

    EditText carModel;
    EditText carCapacity;
    EditText carType;
    EditText carBasePrice;

    CheckBox isGreen;
    boolean green = false;

    public ArrayList<Vehicle> allVehicles;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vehicle);

        mAuth = FirebaseAuth.getInstance();
        firestore = FirebaseFirestore.getInstance();
        mUser = mAuth.getCurrentUser();

        carModel = findViewById(R.id.CarModelText);
        carCapacity = findViewById(R.id.CapacityText);
        carType = findViewById(R.id.VehicleTypeText);
        carBasePrice = findViewById(R.id.basePriceText);

        isGreen = findViewById(R.id.checkBox);

//        if(isGreen.isChecked()){
//            green = true;
//        }


    }

    /**
     * This method is used to create a new vehicle for the user. It receives all the information
     * from the user and then adds it to Firebase.
     * @param v
     */


    public void addVA(View v) {

        String model = carModel.getText().toString();
        String capacity = carCapacity.getText().toString();
        int capacityInt =  Integer.parseInt(capacity);
        String type = carType.getText().toString();
        String baseprice = carBasePrice.getText().toString();
        double price = Double.parseDouble(baseprice);


        String vID = UUID.randomUUID().toString();



        ArrayList<String> riders = new ArrayList<String>();

        Vehicle vehicle = new Vehicle(mUser.getUid(), model,vID, capacityInt, riders, true, type, price, true);
        firestore.collection("vehicles").document("car").collection("4").document(vID).set(vehicle);
//        allVehicles.add(vehicle);

       firestore.collection("users/students/y12").document(mUser.getUid()).get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
           @Override
           public void onComplete(@NonNull Task<DocumentSnapshot> task) {
               if (task.isSuccessful()){
                   DocumentSnapshot ds = task.getResult();

                  CISUser thisUser = ds.toObject(CISUser.class);

                  ArrayList <String> vs = new ArrayList<>();

//                  vs = thisUser.getOwnedVehicles();
                  vs.add(vehicle.getVehicleID());
                  thisUser.setOwnedVehicles(vs);

                  firestore.collection("users/students/y12").document(mUser.getUid()).update("ownedVehicles", thisUser.getOwnedVehicles());



               }
           }
       });


    }


}