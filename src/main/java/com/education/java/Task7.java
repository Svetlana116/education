package com.education.java;

public class Task7 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        a += b;
        b = a - b;
        a = a - b;

        System.out.println(a + ", " + b);
    }
}
