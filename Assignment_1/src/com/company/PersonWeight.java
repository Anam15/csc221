package com.company;
import java.util.GregorianCalendar;

public class PersonWeight {
    private String Full_Name;
    private int Year_of_birth;
    private double Height;
    private double Weight;

    //default constructor
    public PersonWeight(){
        Full_Name = "John Doe";
        Year_of_birth = 1990;
        Height = 1.36;
        Weight = 100.6;
    }

    //Non-default constructor
    public PersonWeight(String full_Name, int year_of_birth, double height, double weight) {
        Full_Name = full_Name;
        Year_of_birth = year_of_birth;
        Height = height;
        Weight = weight;
    }
    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String full_Name) {
        Full_Name = full_Name;
    }

    public int getYear_of_birth() {
        return Year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        Year_of_birth = year_of_birth;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    //Methods
    public int computeAge(){
      int  current_year = new GregorianCalendar().get(GregorianCalendar.YEAR);
      int current_age = current_year - Year_of_birth;
      return current_age;
    }

    public double computeBMI(){
        double bmi = (Weight)/(Height * Height);
        return bmi;
    }

}

