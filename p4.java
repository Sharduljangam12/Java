//Make  a Calculator . Take 2 number ( a& b from the user and an operation as follows:)
/*
 * 1.+(Addition )a+ b
 * 2.-(Subtraction )a- b
 * 3.*(Multiplication )a* b
 * 4./(Division )a/ b
 * 5.%(Modulus )a% b
 * Calculate the result according to the operation given and display it to the user
 */

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Simple calculator program");
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Addition of both numbers is:- "+ (a+b));
        System.out.println("Subtraction of both numbers is :- "+ (a -b));
        System.out.println("Multiplication of both numbers is :- "+ (a*b));
        System.out.println("Division of both numbers is:- "+ (a/b));
        System.out.println("Modulus of both numbers is :- "+ (a%b));
    }
}
