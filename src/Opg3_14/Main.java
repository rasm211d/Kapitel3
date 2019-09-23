package Opg3_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flip = (int)(Math.random()*2+1);

        System.out.println();
        System.out.println("This is a coinflipper where 1 = heads and 2 = tails");
        System.out.println("Enter your guess: ");
        int guess = input.nextInt();

        if (guess == 1) {
            System.out.println("You guessed heads");
        } else {
            System.out.println("You guessed tails");
        }
        if (flip == 1) {
            System.out.println("And it was heads");
        } else {
            System.out.println("And it was tails");
        }
        if (flip == guess) {
            System.out.println("that means your guess was correct!!");
        } else
            System.out.println("Wrong guess!!");



    }
}
