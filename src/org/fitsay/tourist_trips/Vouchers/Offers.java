package org.fitsay.tourist_trips.Vouchers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Offers {
    private List<Voucher> vouchers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addVoucher(){
        System.out.println("AddVoucher");

    }
    public void DeleteVoucher(){
        System.out.println("DeleteVoucher");
    }
    public void ShowOffers(){
        System.out.println("ShowOffers");
    }
    public void SortByCountry(){
        System.out.println("SortByCountry");
    }
    public void SortByName(){
        System.out.println("SortByName");
    }
    public void SortByCost(){
        System.out.println("SortByCost");
    }
}
