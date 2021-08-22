package com.education.java;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Enter any digit, please!");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

//        for (int i = 1; i <= num; i++){
//            for (int x = 1; x <= num; x++){
//                System.out.print(x * i + "  ");
//            }
//            System.out.println(" ");
//        }

        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j <= num) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println("\n");
            i++;
        }
    }
}
