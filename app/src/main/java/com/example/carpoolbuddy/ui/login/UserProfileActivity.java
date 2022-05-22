package com.example.carpoolbuddy.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.carpoolbuddy.R;
import com.example.carpoolbuddy.Vehicle;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import java.util.ArrayList;

/**
 * This Activity allows the user to update and see their profile
 *
 * @author rheatalwar
 * @version 1
 */


public class UserProfileActivity extends AppCompatActivity {


    FirebaseAuth mAuth;
    FirebaseUser mUser;

    private EditText uName;
    private EditText uType;

    FirebaseFirestore firestore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        uName = findViewById(R.id.uNameEditText);
        uType = findViewById(R.id.uTypeEditText);

        firestore = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();


    }


    /**
     * This method allows the user to sign out
     * @param v
     */

    public void signOut(View v ){

        FirebaseAuth.getInstance().signOut();

    }

    /**
     * This method changes the screen from the current user profile UI to the Vehicles screen
     * @param v
     */
    public void goToVehiclesInfo (View v){

        Intent intent = new Intent(this, VehiclesInfoActivity.class);
        startActivity(intent);


    }

    /**
     * This method allows the user to add their name and the type of user to their profile.
     * @param v
     */

    public void updateProfile (View v){

        String nameString = uName.getText().toString();
        String typeString = uType.getText().toString();
        System.out.println("UID: " + mUser.getUid());

        firestore.collection("users").document("students").collection("y12").document(mUser.getUid()).update("name", nameString);
        firestore.collection("users").document("students").collection("y12").document(mUser.getUid()).update("type", typeString);


    }


}