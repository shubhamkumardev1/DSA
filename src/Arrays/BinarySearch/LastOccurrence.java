package Arrays.BinarySearch;

public class LastOccurrence {
    static void main() {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;

        int answer = -1;
        int left = 0;
        int right = arr.length -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if (arr[mid] == target){
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] > target){
                right = mid -1;
            } else {
                left = mid +1;
            }
        }
        System.out.println("Last occurrence at: "+answer);
    }
}
