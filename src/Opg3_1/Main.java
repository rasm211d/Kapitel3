package Opg3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b and c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double d = (Math.pow(b*b - 4*a*c, 0.5));

        if (d > 0) {
            System.out.println("The equation has two roots " + (-b + d) / 2 * a + " and " + (-b - d) / 2 * a);
        } else if (d == 0) {
            System.out.println("The equation has one root " + -b / 2*a);
        } else {
            System.out.println("The equation has 0 roots");
        }

    }
}
