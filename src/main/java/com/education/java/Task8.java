package com.education.java;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int r = 1;

        for (int i = 1; i <= f; i++){
            r *= i;
        }
        System.out.printf("Factorial %s = %s", f, r);
    }
}
