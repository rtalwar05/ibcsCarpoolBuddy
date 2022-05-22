package com.example.carpoolbuddy;

import java.util.ArrayList;

/**
 * This class is a type of user, allowing the user to specify if they are an teacher.
 *
 * @author Rhea Talwar
 * @version 1
 *
 */


public class Teacher extends CISUser {

    String inSchoolTitle;

    public Teacher(){}

    public Teacher(String uID,
                   String name,
                   String email,
                   String userType,
                   double pm,
                   ArrayList<String> owned,
                   String title) {
        super(uID, name, email, userType, pm, owned);
        this.inSchoolTitle = title;
    }

    public String getInSchoolTitle() {
        return inSchoolTitle;
    }

    public void setInSchoolTitle(String inSchoolTitle) {
        this.inSchoolTitle = inSchoolTitle;
    }
}
