package com.fju;

import java.util.ArrayList;

public class Flavor {
    ArrayList<String> list = new ArrayList<>();
    public Flavor(){

        list.add("1/strawberry");
        list.add("2/chocolate");
        list.add("3/vanilla");
        list.add("4/peanut");
    }
    public void print(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

    }
}
