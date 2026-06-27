package Arrays.BinarySearch;

public class FirstOccurrence {
    static void main() {
        int[] arr = {1,2,2,2,3,3,4};
        int target = 2;

        int answer = -1;
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid = left + (right - left)/2;

            if (arr[mid] == target){
                answer = mid;
                right = mid -1;
            }
            else if (arr[mid] > target){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("First Occurrence at index: " +answer);
    }
}
