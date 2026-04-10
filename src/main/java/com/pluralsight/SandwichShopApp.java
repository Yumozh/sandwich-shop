package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a size number of the sandwich (1) Regular and (2) Large : ");
        int sandwichSize = scanner.nextInt();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tell yes/no if you want your sandwich loaded : ");
        String isLoaded = scanner.nextLine();

        double price;

        if (sandwichSize == 1) {
            price = 5.45;
            if (isLoaded.equals("yes")){
                price = 6.45;
            }
        } else {
            price = 8.95;
            if(isLoaded.equals("yes")){
               price = 10.7;
            }
        }

        double costFinal;

        if (age <= 17) {

            costFinal = price - (price * 0.1);
        } else if (age >= 65) {

            costFinal = price - (price * 0.2);
        } else {

            costFinal = price;

        }

        System.out.printf("Your total cost will be: $%.2f", costFinal);
    }
}
