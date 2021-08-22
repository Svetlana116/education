package com.education.java;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter member");
        int a = scanner.nextInt();
        System.out.println("Enter Progression difference");
        int d = scanner.nextInt();
        System.out.println("Enter k member");
        int n = scanner.nextInt();

        int f = d * (n - 1);
        int c = a + f;

        System.out.println(c);
    }
}
