package org.fitsay.tourist_trips;
import  org.fitsay.tourist_trips.Interface.OwnerInterface;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        OwnerInterface ownerInterface = new OwnerInterface();
        ownerInterface.showMenu();
    }
}