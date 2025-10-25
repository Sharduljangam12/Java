//Write a function which takes in 2 numbers and returns the greater of those two

import java.util.Scanner;

public class p22 {
    public static int findGreater(int x, int y){
        if (x > y){
            System.out.println("1st number is greater ");
        }
        else{
            System.out.println("2nd number is greater");
        }
        return x;
    }
    public static void main(String[] args){
        System.out.println("Enter 2 numbers you want to compare:- ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        findGreater(x, y);
    }
}
