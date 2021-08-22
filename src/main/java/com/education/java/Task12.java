package com.education.java;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Enter any digit, please!");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++){
            for (int x = 1; x <= num; x++){
                System.out.printf("%4s", x * i );
            }
            System.out.println();
        }
    }
}
