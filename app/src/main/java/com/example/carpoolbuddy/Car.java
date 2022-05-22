package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of vehicle, allowing the user to specify if the vehicle is a car.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Car extends Vehicle{

    int range;

    public Car(){}


    public Car(String owner, String model, String vID, int capacity,
               ArrayList<String> ridersUID, boolean open, String type,
               double basePrice, boolean green, int range) {

        super(owner, model, vID, capacity, ridersUID, open, type, basePrice,green);
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
