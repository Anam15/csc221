package com.company;
import java.util.Date;

public abstract class ComputerMonitor extends Screen {
    //constructor
    public ComputerMonitor(long id, double salePrice, Date makeDate, String manufacturer, String model) {
    super(id, salePrice, makeDate, manufacturer, model);

    }

}
