import java.util.Scanner;

public class switchcasecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to perform: +, -,* , /, %");    
        char operation = sc.next().charAt(0);

        switch(operation){
            case '+': System.out.println("The sum of the two numbers is: " + (a+b));
            break;
            case '-': System.out.println("The difference of the two numbers is: " + (a-b));
            break;
            case '*': System.out.println("The product of the two numbers is: " + (a*b));
            break;
            case '/': System.out.println("The division of the two numbers is: " + (a/b));
            break;
            case '%': System.out.println("The remainder of the two numbers is: " + (a%b));
            break;
            default: System.out.println("Invalid operation");
        }      
        System.out.println("Thank you for Using the Application");
    }
}
