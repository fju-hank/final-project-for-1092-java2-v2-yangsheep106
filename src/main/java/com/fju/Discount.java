package com.fju;

public class Discount {
    public int discount(int number) {
        if (number == 23 || number == 123 || number == 234) {
            return -10;
        } else {
            return 0;
        }


    }
   /* public int discount(int first, int second, int third){
        if(first == second || second == third || first == third){
            return -10;
        } else {
            return -20;
        }
    }*/

}


