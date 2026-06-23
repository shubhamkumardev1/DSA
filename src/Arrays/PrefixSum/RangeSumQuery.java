package Arrays.PrefixSum;

import java.util.Arrays;

public class RangeSumQuery {
    static void main() {
        int[] arr = {2,4,1,7,3};
        int left = 2;
        int right = 4;

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        int range;
        if (left == 0){
            range = prefix[right];
        } else {
            range = prefix[right] - prefix[left-1];
        }
        System.out.println("Array: " +Arrays.toString(arr));
        System.out.println("Prefix Sum: " +Arrays.toString(prefix));
        System.out.println("Range Sum: " +range);
    }
}
