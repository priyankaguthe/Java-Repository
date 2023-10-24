 import java.util.Arrays;
 class Solution {
    public static void main(String[] args) {
            int arr[]= {0,1,2,2,3,3,3};
        

    
     removeDuplicates(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }

        int uniqueCount = 1;
        int left = 0;

        for (int right = 1; right < arr.length; right++) {
            if (arr[right] != arr[left]) {
                left++;
                arr [left] = arr [right];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
}