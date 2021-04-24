package com.hrabrov;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom(); //instance a SimpleDotCom object
        int[] location = {2, 3, 4}; //make an int array for the location of the DotCom
        dot.setLocationCells(location); //invoke the setter method on the object DotCom with name 'dot'

        String userGuess = "2"; //make a fake user guess

        String result = dot.checkYourself(userGuess); //invoke the checkYourself() method on the object DotCom

       //test-code
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed"; //if the fake guess (variable userGuess) give back a 'hit', then it's working
        }
        System.out.println(testResult);
    }
}
