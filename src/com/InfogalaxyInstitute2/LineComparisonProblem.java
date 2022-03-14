package com.InfogalaxyInstitute2;

import java.util.Scanner;

public class LineComparisonProblem {

    public static void equals(double lengthofline1, double lengthofline2) {
        if (lengthofline1 == lengthofline2) {
            System.out.println("Both Lines are Same. ");
        } else {
            System.out.println("Lines are Not Same. ");
        }
    }

    public static void main(String[] args) {
        double x1 ;
        double y1 ;
        double x2 ;
        double y2 ;

        //UC-2-Length of 2 Lines Calculated
        double a1 ;
        double b1 ;
        double a2 ;
        double b2 ;

        System.out.println("Welcome to Line Comparison Computation Program on Master Branch Developed by Mayur");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of X1 Coordinate : ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the Value of Y1 Coordinate : ");
        y1 = scanner.nextDouble();
        System.out.println("Enter the Value of X2 Coordinate : ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the Value of Y2 Coordinate : ");
        y2 = scanner.nextDouble();
        double lengthofline1 = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
        System.out.println("Length of first Line is =" +lengthofline1);

        System.out.println("Enter the Value of A1 Coordinate : ");
        a1 = scanner.nextDouble();
        System.out.println("Enter the Value of B1 Coordinate : ");
        b1 = scanner.nextDouble();
        System.out.println("Enter the Value of A2 Coordinate : ");
        a2 = scanner.nextDouble();
        System.out.println("Enter the Value of B2 Coordinate : ");
        b2 = scanner.nextDouble();
        double lengthofline2 = Math.sqrt(Math.pow((a2 - a1) , 2) + Math.pow((b2 - b1) , 2));
        System.out.println("Length of Second Line is = " +lengthofline2);

        equals(lengthofline1,lengthofline2);
    }

}
