//Print all even numbers til n
/*
 * Run 
 * for(; ;)
{
 System.outprinln("Apna College");
 } */
//#rd problem 

/* 4th problem 
 Print if a number is prime or not(input from the user)
 [In this problem you will learn how to check if a number is prime or not]
 */

import java.util.Scanner;

public class p {
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want of find the even numbers :- ");
        int n = sc.nextInt();
        for(int i = 0; i<= n; i++){
            if(i%2 == 0)
            System.out.println(i);
        }
    }
}