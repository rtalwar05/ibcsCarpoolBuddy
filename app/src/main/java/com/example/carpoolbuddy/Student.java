package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of user, allowing the user to specify if they are an student.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */

public class Student extends CISUser {

    String gradYear;
    String parentUIDs;

    public Student(){}

    public Student(String uID, String name, String email, String userType, double pm, ArrayList<String> owned,
                   String grad, String parents) {
        super(uID, name, email, userType, pm, owned);
        this.gradYear = grad;
        this.parentUIDs = parents;


    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getParentUIDs() {
        return parentUIDs;
    }

    public void setParentUIDs(String parentUIDs) {
        this.parentUIDs = parentUIDs;
    }
}
