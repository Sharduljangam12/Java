//Enter 3 numbers fromt he user and make a function to print their average

import java.util.Scanner;

public class p20 {
    public static int average(int a, int b, int c) {
        return a+b+c/3;
    }

    public static void main(String args[]){
        System.out.println("Enter the Numbers whoes average you want");
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = average(a, b,c);
        System.out.println(result);
    }
}
