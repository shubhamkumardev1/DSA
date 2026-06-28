package Arrays.BinarySearch;

public class MinInRotatedSortedArray {
    static void main() {
        int[] arr = {4,5,6,7,8,9,1,2};
        int left = 0;
        int right = arr.length-1;

        while (left<right){
            int mid = left + (right-left)/2;
            if (arr[mid] > arr[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println("Minimum element in the array: " +arr[left]);
    }
}
