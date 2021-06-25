package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Pack pack = new Pack();
        Scoops scoops = new Scoops();
        Flavor flavor = new Flavor();
        Discount discount = new Discount();
        Discount2 discount2 = new Discount2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to pack ice cream?" );
        pack.print();
        int choice1 = scanner.nextInt();
        System.out.println("How many scoops would you like?(1-3)");
        int choice2 = scanner.nextInt();
        System.out.println("Which flavor would you like?");
        flavor.print();
        int choice3 = scanner.nextInt();
        System.out.println("Total : " + (int)(discount2.discount2(choice1) + choice2*30 + discount.discount(choice3)));





        /*if(choice2 == 1) {
            System.out.println("Which flavor would you like?");
            int choice3 = scanner.nextInt();
        } else if(choice2 == 2) {
            System.out.println("Which first flavor would you like?");
            int choice3 = scanner.nextInt();
            System.out.println("Which second flavor would you like?");
            int choice4 = scanner.nextInt();

        } else {
            System.out.println("Which first flavor would you like?");
            int choice3 = scanner.nextInt();
            System.out.println("Which second flavor would you like?");
            int choice4 = scanner.nextInt();
            System.out.println("Which third flavor would you like?");
            int choice5 = scanner.nextInt();
            discount.discount(choice3, choice4, choice5);
        }


        System.out.println("Total = " + choice2*30 );*/








    }
}
