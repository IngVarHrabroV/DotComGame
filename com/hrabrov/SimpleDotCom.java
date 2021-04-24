package com.hrabrov;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess); //convert the String type to an int type

        /* make a variable to hold the result we will return after implementation this method
        * put 'miss' in the default */
        String result = "miss";

        /* repeat with each cell in the locationCells array */
        for(int cell : locationCells) {
            if (guess == cell) { //compare user guess to this element (cell) in the array
                result = "hit";
                numOfHits++;
                break;
            }
        }

        /* we're the loob, but let's see if we're now 'kill' DotCom,
         and change the value result to 'kill' */
        if(numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result); // display the result for the user

        return result; // return the result back to the calling method

    };

    //setter method for reasign value variable 'locationCells'
    void setLocationCells(int[] loc) {
        locationCells = loc;
    };

}