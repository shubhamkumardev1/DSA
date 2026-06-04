package Arrays.TwoPointers;

import java.util.Arrays;

public class ReverseString {
    static void main(String[] args) {
        String s = "GOVINDPURI";
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(arr);
    }
}
