package com.company;

import java.util.Date;

public class LED extends ComputerMonitor {
    //constructor
    public LED(long id, double salePrice, Date makeDate, String manufacturer, String model) {
        super(id, salePrice, makeDate, manufacturer, model);
    }

    //returns true if two objects have same SalePrice
    @Override
    public boolean equals(Object obj) {
       if(!(obj instanceof LED)){
           return false;
       }
       else if(obj == this){
           return true;
       }
       return ((LED) obj).getSalePrice() == this.getSalePrice();
    }

    public String getType(){
        return "LED";
    }

}
