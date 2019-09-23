package Opg3_6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        int weight = input.nextInt();
        double kg = weight * 0.4535;

        System.out.println("Enter feet: ");
        int feet = input.nextInt();
        double meters = feet * 0.3048;

        System.out.println("Enter inches: ");
        int inches = input.nextInt();
        double meters2 = inches*0.0254;

        double BMI = kg / Math.pow((meters2+meters), 2);
        System.out.println("Your bmi is calculated to: " + BMI);

    }
}
