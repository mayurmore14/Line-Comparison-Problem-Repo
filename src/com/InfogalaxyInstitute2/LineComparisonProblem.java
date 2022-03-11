package com.InfogalaxyInstitute2;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        double x1 ;
        double y1 ;
        double x2 ;
        double y2 ;
        double length ;
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch Developed by Mayur");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of x1 Coordinate :");
        x1 = scanner.nextDouble();
        System.out.println("Enter the Value of x2 Coordinate :");
        x2 = scanner.nextDouble();
        System.out.println("Enter the Value of y1 Coordinate :");
        y1 = scanner.nextDouble();
        System.out.println("Enter the Value of y2 Coordinate :");
        y2 = scanner.nextDouble();
        length = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
        System.out.println("Length of Line is =" +length);

    }
}
