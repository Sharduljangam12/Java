 import java.util.Arrays;

public class sort{
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr); // Ascending

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
