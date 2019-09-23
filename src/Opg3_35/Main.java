package Opg3_35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInt = input.nextInt();
        int num = userInt % 2;

        if (num == 0) {
            System.out.println("The number you entered is even");
        } else {
            System.out.println("The number you entered is odd");
        }
    }
}
