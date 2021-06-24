package com.fju;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pack pack = new Pack();
        System.out.println("What do you want to pack ice cream?" );
        pack.print();
        int choice = scanner.nextInt();
        Flavor flavor = new Flavor();
        System.out.println("How many scoops would like?(1-3)");
        flavor.scoop(scanner.nextInt());






    }
}
