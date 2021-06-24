package com.fju;

import java.util.ArrayList;

public class Pack{

    public void print() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1/cone");
        list.add("2/cup");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
