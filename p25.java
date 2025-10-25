import java.util.Scanner;

public class p25 {
    public static int pnz(int n){
        if(n == 0){
            System.out.println("Equal");
        }else if(n > 0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }
    return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pnz(n);
    }
}
