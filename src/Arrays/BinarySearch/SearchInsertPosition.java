package Arrays.BinarySearch;

public class SearchInsertPosition {
    static void main() {
        int[] arr = {1,2,3,5,6};
        int target = 4;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if (arr[mid] == target){
                System.out.println("At Index: " + mid);
                return;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
              left = mid + 1;
            }
        }
        System.out.println("Insertion at: " +left);
    }
}
