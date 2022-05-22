package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of vehicle, allowing the user to specify if the vehicle is a segway.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Segway extends Vehicle{

    int range;
    int weightCapacity;

    public Segway(){}


    public Segway(String owner, String model, String vID, int capacity,
                  ArrayList<String> ridersUID, boolean open, String type,
                  double basePrice, boolean green, int range, int weight) {
        super(owner, model, vID, capacity, ridersUID, open, type, basePrice,green);
        this.range = range;
        this.weightCapacity = weight;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
