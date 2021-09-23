package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        System.out.println("Enter side1: ");
        double side1 = scanner.nextFloat();

        System.out.println("Enter side2: ");
        double side2 = scanner.nextFloat();

        System.out.println("Enter side3: ");
        double side3 = scanner.nextFloat();

        Triangle triangle = new Triangle(color, true, side1, side2, side3 );
        System.out.println(triangle);
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("Area = " + triangle.getArea());

    }
}
