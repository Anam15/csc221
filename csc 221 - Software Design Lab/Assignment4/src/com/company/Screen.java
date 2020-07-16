package com.company;
import java.util.Date;

public abstract class Screen {
    private long id;
    private double salePrice;
    private Date makeDate;
    private String manufacturer;
    private String model;

    //public constructor
    public Screen(long id, double salePrice, Date makeDate, String manufacturer, String model) {
        this.id = id;
        this.salePrice = salePrice;
        this.makeDate = makeDate;
        this.manufacturer = manufacturer;
        this.model = model;
    }
    public abstract String getType();

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Getters
    public long getId() {
        return id;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
    public abstract boolean equals(Object obj);

    @Override
    public String toString() {
        String s = "Screen {" +
                "id = " + id +
                "salePrice =  " + salePrice +
                "makeDate =  " + makeDate.toString() +
                "manufacturer =  " + manufacturer +
                "model = " + model + " }";
        return s;
    }
}
