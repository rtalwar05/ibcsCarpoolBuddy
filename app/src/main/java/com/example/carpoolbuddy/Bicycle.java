package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of vehicle, allowing the user to specify if the vehicle is a bicycle.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Bicycle extends Vehicle {


    int weight;
    int weightCapacity;

    public Bicycle(){}


    public Bicycle(String owner, String model, String vID, int capacity,
                   ArrayList<String> ridersUID, boolean open, String type,
                   double basePrice, boolean green, int weight, int weightcap) {

        super(owner, model, vID, capacity, ridersUID, open, type, basePrice, green);
        this.weight = weight;
        this.weightCapacity = weightcap;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
