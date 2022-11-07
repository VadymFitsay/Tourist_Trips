package org.fitsay.tourist_trips.Orders;
import java.util.ArrayList;
import java.util.List;
public class Order {
    private String NameCustomer;
    private String PhoneNumber;
    private final int OrderID;
    public static int NumOrders;
    protected final List<Order> orders = new ArrayList<>();

    public Order(){
        OrderID = NumOrders;
        NumOrders++;
    }

    @Override
    public String toString() {
        return "Order{" +
                "NameCustomer='" + NameCustomer + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", OrderID=" + OrderID +
                ", orders=" + orders +
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

    public int getOrderID() {
        return OrderID;
    }

    public static int getNumOrders() {
        return NumOrders;
    }

    public static void setNumOrders(int numOrders) {
        NumOrders = numOrders;
    }
}
