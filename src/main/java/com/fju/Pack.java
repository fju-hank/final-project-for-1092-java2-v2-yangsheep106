package com.fju;

import java.util.ArrayList;

public class Pack {
    ArrayList<String> list = new ArrayList<>();

    public Pack() {
        list.add("1/cone");
        list.add("2/cup");
    }
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

