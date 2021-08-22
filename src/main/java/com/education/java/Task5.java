package com.education.java;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите время падения камня ");

        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();

        double g = 9.8;
        double h;
        double qTime = Math.pow(time, 2);
        h = (g * qTime) / 2;
        System.out.println("Глубина колодца равна " + String.format("%.2f", h) + " метров");

    }
}
