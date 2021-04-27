package com.hrabrov;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc) { // setter method for reasign value variable 'locationCells'
        locationCells = loc;
    };

    public String checkYourself(String userInput) {
        /* make a variable to hold the result we will return after implementation this method
        * put 'miss' in the default */
        String result = "miss";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }

        System.out.println(result); // display the result for the user

        return result; // return the result back to the calling method
    }
}