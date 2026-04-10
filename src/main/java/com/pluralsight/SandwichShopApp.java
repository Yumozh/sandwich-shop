package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a size number of the sandwich (1) Regular and (2) Large : ");
        int sandwichSize  = scanner.nextInt();

        System.out.println("Please enter your age: ");
        int age  = scanner.nextInt();

        double price;

        if (sandwichSize == 1){
            price = 5.45;
        } else{
            price = 8.95;
        }


    }
}
