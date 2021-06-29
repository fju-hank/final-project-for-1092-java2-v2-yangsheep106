package com.fju;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Time time = new Time();
        Hello hello = new Hello();
        Pack pack = new Pack();
        Discount discount = new Discount();
        Flavor flavor = new Flavor();
        Cake cake = new Cake("milk tea",50);
        Cake1 cake1 = new Cake1("Earl Grey",55);
        Cake2 cake2 = new Cake2("Oolong tea", 55);
        Scanner scanner = new Scanner(System.in);
        hello.hello();
        System.out.println("What do you want to pack ice cream?" );
        pack.print();
        int choice1 = scanner.nextInt();
        System.out.println("How many scoops would you like? (1-3)");
        int choice2 = scanner.nextInt();
        System.out.println("Which flavor would you like?");
        flavor.print();
        int choice3 = scanner.nextInt();
        System.out.println("Would you like to buy more ice cream cake? (1/Yes, 2/No)");
        int choice4 = scanner.nextInt();
        if(choice4 == 1){
            System.out.println("Which flavor would you like? (1/"+ cake.id + " $" + cake.price + ", 2/" + cake1.id + " $" + cake1.price + ", 3/" + cake2.id + " $" + cake1.price + ")");
            int choice5 = scanner.nextInt();
            if(choice5 == 1){
                System.out.println("Your total is $" + (discount.discount(choice1) + choice2*30 + time.discount(choice3) + cake.price));
            } else {
                System.out.println("Your total is $" + (discount.discount(choice1) + choice2*30 + time.discount(choice3) + cake1.price));
            }

        } else {
            System.out.println("Ok. Your total is $" + (discount.discount(choice1) + choice2*30 + time.discount(choice3)));
        }

    }
}