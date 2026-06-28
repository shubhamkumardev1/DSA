package Arrays.BinarySearch;

public class PeakElement {
    static void main() {
        int[] arr = {1,2,3,1};
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            int mid = left + (right - left)/2;
            if (arr[mid] < arr[mid+1]){
                left = mid+1;
            } else {
                right = mid;
            }
        }
        System.out.println("Peak Element: " +arr[left]);
    }
}
