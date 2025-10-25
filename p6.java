/*
 * Make menu driven program. The user can enter 2 numbers, either 1 or 0 if the user eneters 1 then keep taking input from the user for a students's makrs (out of 100)
 * if they enter 0 then stop
 if he.she scores: 
 Marks >= 90 -> print "this is good"
 89 > = marks >= 60 -> print "This is also Good 
 59 >= marks >= 0 -> print {" This is good as well "}
 Because marks don't matter but out effort does.(Hint Use do-while loop but think & understand why)
 */

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice between 1 and 0 ");
        int x = sc.nextInt();
        do{
            System.out.println("Enter the marks of Students out of 100");
            int y = sc.nextInt();
            if (y >= 90) {
                System.out.println("This is Good");
            }
            if (y <= 60){
                System.out.println("This is also good ");
            }
            if (y <= 10){
                System.out.println("This is also as well");
            }
            else{
                System.out.println("Marks doesn't matter but your efforts does");
            }
        }while (x == 1);
            
    */
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100){
                System.out.println("This is Good");
            } else if(marks >= 60 && marks <= 89){
                System.out.println("This is also Good");
            } else if(marks >= 0 && marks <= 59){
                System.out.println("This is Good as well");
            }else {
                System.out.println("Invalid");
            }
             System.out.println("Want to continue ? (Yes(1) or no(0))");
             input = sc.nextInt();

        } while(input == 1);
    }
}
