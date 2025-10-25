
import java.util.Scanner;

//Write a function that takes in age as input and returns if that person is eligible to vote or not . A person of age > 18 is eligible to vote
/* 
public class p24 {
    public static int age(int x) {
        if(x >= 18){
            System.out.print("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
        return age(x);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();

        age(x);
    }
}
*/
public class p24 {
    public static int getGreater(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreater(a, b));
    }
}
