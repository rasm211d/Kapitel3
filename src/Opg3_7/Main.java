package Opg3_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount in dollars ex: 14,89: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount*100);

        int dollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int quarters = remainingAmount /25;
        remainingAmount = remainingAmount % 25;

        int dimes = remainingAmount /10;
        remainingAmount = remainingAmount % 10;

        int nickels = remainingAmount /5;
        remainingAmount = remainingAmount % 5;

        int cents = remainingAmount;

        System.out.println("Your amount " + amount + " consists of:");
        if (dollars == 1) {
            System.out.println(dollars + " dollar");
        } else {
            System.out.println(dollars + " dollars");
        }
        if (quarters == 1) {
            System.out.println(quarters + " quarter");
        } else {
            System.out.println(quarters + " quarters");
        }
        if (dimes == 1) {
            System.out.println(dimes + " dime");
        } else {
            System.out.println(dimes + " dimes");
        }
        if (nickels == 1) {
            System.out.println(nickels + " nickel");
        } else {
            System.out.println(nickels + " nickels");
        }
        if (cents == 1) {
            System.out.println(cents + " cent");
        } else {
            System.out.println(cents + " cents");
        }



    }
}
