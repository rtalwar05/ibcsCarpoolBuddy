package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of user, allowing the user to specify if they are an parent.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */

public class Parent extends CISUser {

    ArrayList<String> childrenUIDs;

    public Parent(){}


    public Parent(String uID,
                  String name,
                  String email,
                  String userType,
                  double pm,
                  ArrayList<String> owned,
                  ArrayList<String> children) {
        super(uID, name, email, userType, pm, owned);
        this.childrenUIDs = children;
    }

    public ArrayList<String> getChildrenUIDs() {
        return childrenUIDs;
    }

    public void setChildrenUIDs(ArrayList<String> childrenUIDs) {
        this.childrenUIDs = childrenUIDs;
    }
}
