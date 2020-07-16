package com.company;

import java.util.Date;

public class CRT extends ComputerMonitor{
    private double glassThickness;

    //constructor
    public CRT(double salePrice, long id, double glassThickness, Date makeDate, String manufacturer, String model) {
        super(id, salePrice, makeDate, manufacturer, model);
        this.glassThickness = glassThickness;
    }
    //methods
    public double getGlassThickness() {
        return glassThickness;
    }

    public void setGlassThickness(double glassThickness) {
        this.glassThickness = glassThickness;
    }
    public String getType(){
        return "CRT";
    }


    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CRT)){
            return false;
        }
        else if(obj == this){
            return true;
        }
        return ((CRT) obj).getId() == this.getId();
    }
}
