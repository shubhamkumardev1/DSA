package Arrays.BinarySearch;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 18;

        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                System.out.println("At Index: " +mid);
                return;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Element not found!");
    }
}
