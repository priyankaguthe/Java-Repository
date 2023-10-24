import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
       // public static int[] removeDuplicates(int[] arr) {
    // Implementation to remove duplicates


        int[] arr = {0,1, 2, 2, 3,3,3,4,4,4,4,5,5,5,5,5};
        int[] result = removeDuplicates(arr);
        System.out.println("Array elements: " + Arrays.toString(arr));

    }

    static int removeDuplicates(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length;
        }

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length - 1];

        // Updating the original array with unique elements
        for (int k = 0; k < j; k++) {
            arr[k] = arr[k];
        }

        return j;
    }
}
