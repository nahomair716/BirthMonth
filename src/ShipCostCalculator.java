import javax.swing.*;
import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double totalPrice = 0.0;

        System.out.println("Enter the price of your item ");

        itemPrice = in.nextDouble();
        if (itemPrice >= 100) {
            System.out.println("Your Shipping is free!");
        } else {
            shippingCost = itemPrice * 0.02;
            System.out.println("Your shipping price is $ "+shippingCost);
        }
        totalPrice = itemPrice + shippingCost;
        System.out.println("Your total price will be $ "+ totalPrice);
    }

}

