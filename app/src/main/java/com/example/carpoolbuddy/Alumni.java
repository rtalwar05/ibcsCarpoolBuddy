package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of user, allowing the user to specify if they are an alumni.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Alumni extends CISUser {

    String graduateYear;

    public Alumni(){}

    public Alumni(String uID,
                  String name,
                  String email,
                  String userType,
                  double pm,
                  ArrayList<String> owned,
                  String year) {
        super(uID, name, email, userType, pm, owned);
        this.graduateYear = year;
    }


    public String getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(String graduateYear) {
        this.graduateYear = graduateYear;
    }
}
