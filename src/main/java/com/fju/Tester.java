package com.fju;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pack pack = new Pack();
        System.out.println("What do you want to pack ice cream?" );
        pack.print();
        int choice1 = scanner.nextInt();
        Scoops scoops = new Scoops();
        System.out.println("How many scoops would you like?(1-3)");
        scoops.scoop(scanner.nextInt());
        Flavor flavor = new Flavor();
        System.out.println("Which flavor would you like?");
        flavor.print();
        int choice2 = scanner.nextInt();








    }
}
