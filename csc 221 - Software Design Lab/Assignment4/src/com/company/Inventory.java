package com.company;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Screen> listInventory;

    //constructor
    public Inventory() {
       listInventory =  new ArrayList<Screen>();

    }
    public ArrayList<SmartTV> listSmartTV() {
        ArrayList<SmartTV> listSmartTV = new ArrayList<>();
        for(int i = 0; i<listInventory.size(); i++){
            if(listInventory.get(i) instanceof SmartTV){
                listSmartTV.add((SmartTV) listInventory.get(i));
            }
        }
        return listSmartTV;
    }

    public ArrayList<ComputerMonitor> listComputerMonitor() {
        ArrayList<ComputerMonitor> listComputerMonitor = new ArrayList<>();
        for(int i = 0; i<listInventory.size(); i++){
            if(listInventory.get(i) instanceof ComputerMonitor){
                listComputerMonitor.add((ComputerMonitor) listInventory.get(i));
            }
        }
        return listComputerMonitor;
    }


    //methods
    public int inventoryCount(){

        return listInventory.size();
    }
    public boolean addToInventory(Screen screen) throws Exception{
        if (listInventory.contains(screen)){
            throw new Exception("This inventory has a similar screen"); //throws an exception
        }
        else{
            listInventory.add(screen);
            return true;
        }
    }

    public void printInventory(){
        System.out.println("+-------+-------------+----------+-----------------------------+---------------+----------+-------+-------------+");
        System.out.println("| Type  |      ID     | Price    |      Make Date              | Manufacture   |   Model  | Glass |    OS       |");
        for(Screen screen : this.listInventory){
            System.out.println("+-------+-------------+----------+-----------------------------+---------------+----------+-------+-------------+");

            System.out.printf(("| %-6s|"),screen.getType());
            System.out.printf(" %-12d|",screen.getId());
            System.out.printf(" $%,-8.1f|",screen.getSalePrice());
            System.out.printf(" %11s|",screen.getMakeDate().toString());
            System.out.printf("  %-13s|",screen.getManufacturer());
            System.out.printf("%9s |",screen.getModel());

            if (screen instanceof CRT){
                System.out.printf("%6.2f |",((CRT)screen).getGlassThickness());
            }
            else{
                System.out.printf("%6s |", " ");
            }
            if (screen instanceof SmartTV){
                System.out.printf("%11s |",((SmartTV)screen).getOperatingSystem());
            }
            else{
                System.out.printf("%11s |", " ");
            }
            System.out.println("");



        }
        System.out.println("+-------+-------------+----------+-----------------------------+---------------+----------+-------+-------------+");

    }



}
