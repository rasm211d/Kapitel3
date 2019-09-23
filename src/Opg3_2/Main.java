package Opg3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int)(Math.random()*9+1);
        int b = (int)(Math.random()*9+1);
        int c = (int)(Math.random()*9+1);

        System.out.println("Multiply the three number " + a + ", " + b + " and " + c);
        System.out.println("Enter your answer ");
        int answer = input.nextInt();

        if (answer == a*b*c) {
            System.out.println("CORRECT");
        } else {
            System.out.println("Wrong answer my guy");
        }


    }
}
