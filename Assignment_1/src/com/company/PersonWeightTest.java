package com.company;

import java.util.Scanner;

public class PersonWeightTest {
        //returns a classification for a given BMI
        private static String classifyBMI(double BMI) {
            if (BMI < 18.5)
                return "Underweight";

            else if (BMI >= 18.5 && BMI < 25)
                return "Normal Weight";

            else if (BMI >= 25 && BMI < 30)
                return "Overweight";

            else
                return "Obese";
        }

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in); //creates a new Scanner instance that points tp the input stream passed as an argument
        PersonWeight person_1 = new PersonWeight(); //instance of default constructor
        PersonWeight person_2 = new PersonWeight();//instance of a non-default constructor

        String FullName;
        int YearOfBirth;
        double height;
        double weight;

        System.out.printf("Enter person's name: ");
        FullName = keyboard.nextLine(); //assigns whatever the user types in to the variable FullName

        System.out.printf("Enter person's year of birth: ");
        YearOfBirth = keyboard.nextInt();

        System.out.printf("Enter person's height in meters: ");
        height = keyboard.nextDouble();

        System.out.printf("Enter person's weight in kilograms: ");
        weight = keyboard.nextDouble();

        System.out.printf(" Full Name: %s\n", person_1.getFull_Name());
        System.out.printf(" Age: %d\n", person_1.computeAge());
        System.out.printf(" Height: %1.2f\n", person_1.getHeight());
        System.out.printf(" Weight: %1.2f\n", person_1.getWeight());
        System.out.printf("Classification: %s\n", PersonWeightTest.classifyBMI(person_1.computeBMI()));
        System.out.printf("\n\n");


        System.out.printf("Enter person's name: ");
        person_2.setFull_Name(keyboard.nextLine()); //nextLine method - returns string from the current position to the next line
        person_2.setFull_Name(keyboard.nextLine());


        System.out.printf("Enter person's year of birth: ");
        person_2.setYear_of_birth(keyboard.nextInt()); //set whatever the user typed in to the variable Year_of_birth

        System.out.printf("Enter person's height in meters: ");
        person_2.setHeight(keyboard.nextDouble());

        System.out.printf("Enter person's weight in kilograms: ");
        person_2.setWeight(keyboard.nextDouble());

        System.out.printf("Full Name: %s\n", person_2.getFull_Name());
        System.out.printf("Age: %d\n", person_2.computeAge());
        System.out.printf("Height: %1.2f\n", person_2.getHeight()); // display at least one digit before the decimal and exactly 2 digits after the decimal
        System.out.printf("Weight: %1.2f\n", person_2.getWeight());
        System.out.printf("Classification: %s\n", PersonWeightTest.classifyBMI(person_2.computeBMI()));


    }
}
