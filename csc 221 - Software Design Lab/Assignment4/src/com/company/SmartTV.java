package com.company;

import java.util.Date;

public class SmartTV extends Screen{

    private String operatingSystem;

    //constructor
    public SmartTV(String operatingSystem, long id, double salePrice, Date makeDate, String manufacturer, String model) {
        super(id, salePrice, makeDate, manufacturer, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String getType() {
        return "Smart";
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof SmartTV)){
            return false;
        }
        else if(obj == this){
            return true;
        }
        return ((SmartTV) obj).getOperatingSystem() == this.getOperatingSystem();
    }
}
