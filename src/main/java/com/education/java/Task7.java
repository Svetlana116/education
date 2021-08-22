package com.education.java;

public class Task7 {
    public static void main(String[] args) {
        int x = 11;
        double d = 0;
        int y = 1;
        for (int i = 0; i <= x; i++){
            d += 1. / Math.pow(-2, i);
        }
        System.out.println(d);
    }
}
