package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How tall will you like your pyramid to be? Please use a number between 1 and 8.");
        int h = keyboard.nextInt();
        if ((h <= 0) || (h > 8)) {
            System.out.println("Try again.");
        } else if ((h > 0) || (h <= 8)) {
            System.out.println("Thank you! Your pyramid is loading.");


            for (int i = 1; i <= h; i++) {
                for (int j = h - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int p = 1; p <= i; p++) {
                    System.out.print("#");
                }

                System.out.println(" ");
            }
        }
    }}

