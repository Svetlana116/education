package com.education.java;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.bitCount(x));
    }
}
