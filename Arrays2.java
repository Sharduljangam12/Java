 import java.util.*;
//This program shows the default value usage of array
public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //for taking input
        for(int i =0; i<size; i++) { 
            numbers[i] = sc.nextInt();
        }
        
        //for output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]+" ");
        }
    }
}
