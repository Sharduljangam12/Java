//ODD EVEN program  using conditional statements 
import java.util.*;
public class conditionalstatements {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
      
        if(x % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}*/
//IF ELSE program
/*public static void main(String args[]){
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a == b){
        System.out.println("Equal");
    }
    else
    {
        if(a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("a is lesser");
        }
    }
}
}*/
//Else if statement
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else if(a> b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
}