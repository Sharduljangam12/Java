//Make a function to check if a number is prime or not
import java.util.*;

public class p17{
    public static void printPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            if(n == 1){
                System.out.println("This is neither prime not composite");
            }else {
                System.out.println("This is a prime number");
            }
        }else{
            System.out.println("This is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPrime(n);
    }
}