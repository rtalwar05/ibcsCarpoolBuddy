package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of vehicle, allowing the user to specify if the vehicle is a helicopter.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Helicopter extends Vehicle {

    int maxAltitude;
    int maxSpeed;

    public Helicopter(){}


    public Helicopter(String owner, String model, String vID, int capacity,
                      ArrayList<String> ridersUID, boolean open, String type,
                      double basePrice, boolean green, int alt, int speed) {
        super(owner, model, vID, capacity, ridersUID, open, type, basePrice,green);
        this.maxAltitude = alt;
        this.maxSpeed = speed;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
