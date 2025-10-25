import java.util.Scanner;
public class input
{
public static void main(String[] args)
{
System.out.println("Taking Input From the User");
Scanner sc = new Scanner(System.in);
System.out.println("enter number 1");
int a = sc.nextInt();
//float a = sc.nextFloat();
System.out.println("enter number 2");
int b = sc.nextInt();

int sum = a + b;
System.out.println("The sum of these numbers is: ");
System.out.println(sum);
}
}

