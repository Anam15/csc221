package com.company;

import java.util.Random;
import java.util.Scanner;

public class SkeeBall
{
    private static final int MAX_PLAYS = 8;
    private int[] landings;

    // Constructor
    public SkeeBall(int numOfPlays) {
        landings = new int[numOfPlays]; //creating an array called landings which is the size of numOfPlays
    }

    public void play() {
        Random rand = new Random(); // Random number initialize
        int randomValue, hallValue;
        for(int i = 0; i < this.landings.length; i++) {
            randomValue = rand.nextInt(100) + 1; // generate a random number between 1 to 100
            hallValue = getHallValue(randomValue); // record the landing value
            this.landings[i] = hallValue;
            switch(hallValue) { // choose the hallvalue in which it landed
                //case is 0, 10 ,20... because hallvalue is being passed in
                case 0:
                    System.out.println("Rolling ball #" + (i + 1) + ". Landed in 0");
                    break;
                case 10:
                    System.out.println("Rolling ball #" + (i + 1) + ". Landed in 10");
                    break;
                case 20:
                    System.out.println("Rolling ball #" + (i + 1)+ ". Landed in 20");
                    break;
                case 40:
                    System.out.println("Rolling ball #" + (i + 1)+ ". Landed in 40");
                    break;
                case 60:
                    System.out.println("Rolling ball #" + (i + 1) + ". Landed in 60");
                    break;
                case 80:
                    System.out.println("Rolling ball #" + (i + 1) + ". Landed in 80");
                    break;
            }
        }
        System.out.println();
    }

    public int getHallValue(int randomValue) {
        int hallValue;
        if(randomValue <= 5)
            hallValue = 80;
        else if(randomValue >= 6 && randomValue <= 15)
            hallValue = 60;
        else if(randomValue >= 16 && randomValue <= 30)
            hallValue = 40;
        else if(randomValue >= 31 && randomValue <= 45)
            hallValue = 20;
        else if(randomValue >= 46 && randomValue <= 65)
            hallValue = 10;
        else
            hallValue = 0;
        return hallValue;
    }

    //function that displays formatted output
    public void showStats() {

        int total = 0;

// prints the header
        System.out.println("+-------+-------+");
        System.out.printf("%7s %7s\n", "Play #", "Score");
        System.out.println("+-------+-------+");

        for(int i=0; i<this.landings.length; i++) {
            System.out.printf("%6d %6d\n", (i+1), this.landings[i]);
            total += this.landings[i];
        }

        System.out.println("\nTotal: " + total);// prints the total
    }

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in); // Input stream
        int numOfPlays; // required variable
        System.out.print("How many plays (1-8)? ");
        numOfPlays = keyboard.nextInt();
        while(numOfPlays < 1 || numOfPlays > MAX_PLAYS) {
            System.out.println("Invalid input. Please enter a number between 1 and 8.");
            System.out.print("How many plays (1-8)? ");
            numOfPlays = keyboard.nextInt();
        }

        SkeeBall object = new SkeeBall(numOfPlays);// create an instance of the SkeeBall class
        object.play(); // invoke method play
        object.showStats();// invoke showStats method
    }
}
