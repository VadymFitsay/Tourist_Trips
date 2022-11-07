package org.fitsay.tourist_trips.Interface;

import org.fitsay.tourist_trips.Command.Receiver;
import org.fitsay.tourist_trips.Vouchers.Offers;
import java.util.Scanner;
public class OwnerInterface {

    private final Scanner scanner = new Scanner(System.in);
    final Offers park = new Offers();
    private final Receiver receiver = new Receiver(park);
    public void showMenu(){
        String value;
        System.out.print("--------------------------Taxi Park--------------------------");
        do {
            System.out.println("\n1.AddVoucher");
            System.out.println("2.ShowOffers");
            System.out.println("3.SortByCost");
            System.out.println("4.SortByCountry");
            System.out.println("5.SortByName");
            System.out.println("8.Exit\n");
            System.out.print("Your choice: ");
            value = scanner.nextLine();
            switch (value) {
                case "1" -> receiver.run(0);
                case "2" -> receiver.run(1);
                case "3" -> receiver.run(2);
                case "4" -> receiver.run(3);
                case "5" -> receiver.run(4);
                case "6" -> System.exit(0);
            }

        } while (true);
    }
}
