package org.fitsay.tourist_trips.Orders;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private String NameCustomer;
    private int OrderID;
    private String PhoneNumber;
    public static int NumOrders;




    @Override
    public String toString() {
        return "Order{" +
                "NameCustomer='" + NameCustomer + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        NameCustomer = nameCustomer;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }



    public static void setNumOrders(int numOrders) {
        NumOrders = numOrders;
    }
}
