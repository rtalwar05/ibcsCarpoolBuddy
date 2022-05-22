package com.example.carpoolbuddy;

import java.util.ArrayList;

public class CISUser {

    String uID;
    String name;
    String email;
    String userType;
    double priceMultiplier;
    ArrayList<String> ownedVehicles;

    public CISUser(){}

    public CISUser(String uID, String email)
    {
        this.uID = uID;
        this.email = email;

    }

    public CISUser(String uID, String name, String email, String userType, double pm, ArrayList<String> owned) {
        this.uID = uID;
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.priceMultiplier = pm;
        this.ownedVehicles = owned;

    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public ArrayList<String> getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setOwnedVehicles(ArrayList<String> ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }
}
