package org.fitsay.tourist_trips.Interface;

import org.fitsay.tourist_trips.Command.CommandsCustomer;
import org.fitsay.tourist_trips.Orders.Orders;
import org.fitsay.tourist_trips.Vouchers.Offers;
import java.util.Scanner;
public class OwnerInterface {

    private final Scanner scanner = new Scanner(System.in);
    final Offers offers = new Offers();
    final Orders orders = new Orders();
    private final CommandsCustomer commands = new CommandsCustomer(offers,orders);
    public void menu(){
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
                case "1" -> commands.run(0);
                case "2" -> commands.run(1);
                case "3" -> commands.run(2);
                case "4" -> commands.run(3);
                case "5" -> commands.run(4);
                case "6" -> System.exit(0);
            }

        } while (true);
    }
}
