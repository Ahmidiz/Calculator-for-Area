package com.company;

import java.util.Scanner;

public class Main {

    /* Common plane figures
    + Square
    + Rectangle
    + Triangle
    + Circle
    + Trapezium
    + Parallelogram
     */


public static void displayMenu() {
    String[] planeFigures = new String[] {"Square","Rectangle","Triangle","Circle","Trapezium","Parallelogram"};
    System.out.println("============================================\n");
    System.out.println("MENU");
    System.out.println("============================================\n");
    System.out.println("Select the plane figure you want to find its area\n");
    for (int i=0;i<planeFigures.length ;i++) {
        System.out.println(i + "-"+ planeFigures[i]);
    }
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    System.out.println("Enter the number of the plane you wat to find its area");
    Scanner input = new Scanner(System.in);
    int selection = input.nextInt();


    if (selection == 3) {
        System.out.println("The area of the Circle is "+ displayInstructionsForCircle() );
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
    }else if (selection == 0)
        System.out.println("The area of the Square is " + displayInstructionsForSquare());
    else if (selection == 1)
        System.out.println("The area of the Rectangle is " + displayInstructionsForRectangle());
    else if (selection == 2)
        System.out.println("The area of the Triangle is " + displayInstructionsForTriangle() );
    else if (selection == 4)
        System.out.println("The area of the Trapezium is "+ displayInstructionsForTrapezium());
    else if (selection == 5)
        System.out.println("The area of the Parallelogram is "+ displayInstructionsForParallelogram());


}
    // How area of square is calculated
    public static double displayInstructionsForSquare(){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");


        // Allow the  user  to make input
        System.out.println("The formula for the Area of a Square is 2 * length ");
        System.out.println("Enter the length of the Square");
        double length = input.nextDouble();

        // Call the calculateAreaOfSquare function
        double result= calculateAreaOfSquare(length);
        return result;


    }
    // Where the calculation of the area of the square is done
    public static double calculateAreaOfSquare(double length) {
    double area = 2 * length;
    return area;

    }
    // How area of rectangle is calculated
    public static double displayInstructionsForRectangle() {
        Scanner input= new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

        // Allows the User to input values to be calculated
        System.out.println("The formula for Area of a Rectangle is Length * Width");
        System.out.println("Enter the value for length of the rectangle");
        double length = input.nextDouble();
        System.out.println("Enter the value for the width of the Rectangle");
        double width = input.nextDouble();

        // Call the calculateAreaOfRectangle function
        double result = calculateAreaOfRectangle(length,width);
        return result;
    }

    public static double calculateAreaOfRectangle(double length,double width) {
        double area = length * width ;
        return area;
    }

    // How area of triangle is calculated
    public static double displayInstructionsForTriangle() {
        Scanner input =new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

        // Allows the User to input values to be calculated
        System.out.println("The formula for Area of a Triangle is 1/2 * Base * height");
        System.out.println("Enter the value for Base of the Triangle");
        double base = input.nextDouble();
        System.out.println("Enter the value for the Height of the Triangle");
        double height = input.nextDouble();

        // Call the calculateAreaOfTriangle function
        double result = calculateAreaOfTriangle(base,height) ;
        return result;
    }

    // Where the calculation of the area of the triangle is done
    public static double calculateAreaOfTriangle(double base,double height) {
        double area = 0.5 * base * height;
        return area;
    }
    // How area of circle is calculated
    public static double displayInstructionsForCircle(){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

        // Allows the User to input values to be calculated
        System.out.println("The formula for the Area of a Circle is pi * radius * radius");
        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();


        // Call the calculateAreaOfCircle function
        double result = calculateAreaOfCircle(radius);
        return result;
    }
    // Where the calculation of the area of the circle is done
    public static double calculateAreaOfCircle(double radius) {
        final double PI = Math.PI;
        double area = PI * Math.pow(radius, 2);
        return area;
}


    public static double displayInstructionsForTrapezium (){
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

        // Allows the User to input values to be calculated
        System.out.println("The formula of Area of a Trapezium is 1/2 * (length A + Length B) * Height");
        System.out.println("Enter the value for Length A");
        double a = input.nextDouble();
        System.out.println("Enter the value for Length B");
        double b = input.nextDouble();
        System.out.println("Enter the value for the Height of the Trapezium");
        double height = input.nextDouble();

        // Call the calculateAreaOfTrapezium function
        double result = calculateAreaOfTrapezium(a,b,height);
        return result;
    }
        // Where the calculation of the area of the trapezium is done
    public static double calculateAreaOfTrapezium(double a,double b,double height) {
        double area = 0.5 * (a + b) * height;
        return area;
    }

    public static double displayInstructionsForParallelogram() {
        Scanner input = new Scanner(System.in);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");

        // Allows the User to input values to be calculated
        System.out.println("The formula of Area of Parallelogram is Base * Height");
        System.out.println("Enter the value for Base of the Parallelogram");
        double base = input.nextDouble();
        System.out.println("Enter the value for Height of the Parallelogram");
        double height = input.nextDouble();

        // Call the calculateAreaOfParallelogram function
        double result = calculateAreaOfParallelogram( base, height);
        return result;
    }
    //  Where the calculation of the area of the parallelogram is done
    public static double calculateAreaOfParallelogram(double base,double height) {
        double area = base * height;
        return area ;
    }

    public static void main(String[] args) {
	 displayMenu();

    }
}
