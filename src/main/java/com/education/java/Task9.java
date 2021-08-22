package com.education.java;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the coordinate X of the center of the circle ");
        int cX = scanner.nextInt();
        System.out.println("Enter the coordinate Y of the center of the circle ");
        int cY = scanner.nextInt();
        System.out.println("Enter the coordinates radius of the circle");
        int r = scanner.nextInt();
        System.out.println("enter the coordinate X of the point");
        int x = scanner.nextInt();
        System.out.println("enter the coordinate Y of the point");
        int y = scanner.nextInt();

        double r2 = Math.pow(r, 2);
        double x1 = Math.pow((x - cX), 2);
        double y1 = Math.pow((y - cY), 2);

        if (x1 + y1 <= r2){
            System.out.println("The point is located in a circle");
        } else {
            System.out.println("The point is not located in a circle");
        }
    }
}
