package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Time time = new Time();
        Hello hello = new Hello();
        Pack pack = new Pack();
        Flavor flavor = new Flavor();
        Discount discount = new Discount();
        Scanner scanner = new Scanner(System.in);
        hello.hello();
        System.out.println("What do you want to pack ice cream?" );
        pack.print();
        int choice1 = scanner.nextInt();
        System.out.println("How many scoops would you like?(1-3)");
        int choice2 = scanner.nextInt();
        System.out.println("Which flavor would you like?");
        flavor.print();
        int choice3 = scanner.nextInt();
        System.out.println("Total : $" + (discount.discount(choice1) + choice2*30 + time.discount(choice3)));

    }
}