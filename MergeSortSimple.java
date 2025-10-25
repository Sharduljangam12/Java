import java.util.Arrays;

public class MergeSortSimple {

    // Merge Sort function
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    // Merge two sorted arrays
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length)
            arr[k++] = (left[i] < right[j]) ? left[i++] : right[j++];

        while (i < left.length)
            arr[k++] = left[i++];

        while (j < right.length)
            arr[k++] = right[j++];
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7,9};
        mergeSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
