package Arrays.BinarySearch;

public class RotatedSortedArray {
    static void main() {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int answer = -1;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == target){
                answer = mid;
                break;
            } else if (arr[left] <= arr[mid]){
                if (target >= arr[left] && target < arr[mid]){
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= arr[right] && target > arr[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(answer);
    }
}
