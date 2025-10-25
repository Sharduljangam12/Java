//This is the 12th project of the series
//Make a program that takes the radius of a circle as input, calculates it's radius and area and prints it as output to the user

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The area of the circle is " + area);
    }
}
