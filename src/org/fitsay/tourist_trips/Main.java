package org.fitsay.tourist_trips;
import  org.fitsay.tourist_trips.Interface.CustomerInterface;
public class Main {
    public static void main(String[] args) {
        CustomerInterface ownerInterface = new CustomerInterface();
        ownerInterface.menu();
    }
}