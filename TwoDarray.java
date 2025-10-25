// for creating 2D array with "new" keyword : int[][] marks = new int[3][3]

//Taking a matrix aa an input and printing it's elements
import java.util.*;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[] [] numbers = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++) {
                System.out.println(numbers[i] [j] +" ");
            }
            System.out.println();
        }
    }
}
