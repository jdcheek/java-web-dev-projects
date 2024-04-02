package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
