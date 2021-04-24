package com.hrabrov;

public class SimpleDotComGame {

    public static void main(String[] args) {
        int numOfGuesses = 0; //make a variable to track, how many guesses the user make
        GameHelper helper = new GameHelper(); //make the GameHelper object for getting user input
        SimpleDotCom theDotCom = new SimpleDotCom(); // make the SimpleDotCom objet

        int randomNum = (int) (Math.random() * 5); //make a random number for the first cell
        int[] locations = {randomNum, randomNum + 1, randomNum + 2}; //create array with locations DotCom
        theDotCom.setLocationCells(locations); //invoke setter method for class SimpleDotCom

        /* make a boolean variable to track wether the game is still alive
        * to use in the while loop test repeat
        * while game is still alive*/
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number"); //get user input String
            String result = theDotCom.checkYourself(guess); // ask the DotCom check the guess; save the returned result in a String
            numOfGuesses++; //increment guess count
            if (result.equals("kill")) {
                isAlive = false; //we wont re-enter the loop
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
