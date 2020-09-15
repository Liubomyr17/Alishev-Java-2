package com.company;

import java.io.Serializable;

public class Solution {
    public static void main(String[] args) {
           int myInt;
           myInt = 557;
           // int myInt = 557 - the same way;
        short myShort = 3266; // 16 bit's small numbers;
        long myLong = 24724824; // 64 bit bif numbers;

        double myDouble = 235.35; // 64 bit;
        float myFloat = 2362.4f; // By default always JAVA thinks about DOUBLE, that's why we should write F in the end of a number;

        char c = 'c'; // the symbol
        boolean b = true;

        byte myByte = 100;  // 8 bit (1 byte) -128-128;
        System.out.println(myInt);
    }
}
