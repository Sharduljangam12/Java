//Make a function to check if a given number n is even or not
import java.util.*;
public class p18 {
    public static void checkeven(int n){

        if ( n %2 == 0){
            System.out.println("This is an even number ");
        } else {
            System.out.println("This is not an even number");
        }
    }
    public static void main(String[] args){
        System.out.print("enter the number you  want to checck is even or not:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkeven(n);
    }
}
