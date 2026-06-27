package Arrays.BinarySearch;

public class FirstAndLastOccurrence {
    static int firstOcc(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                right = mid -1;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }


    static int lastOcc(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        int answer = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                answer = mid;
                left = mid + 1;
            } else if (arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    static void main() {
        int[] arr = {1,2,2,2,3,3,4};
        int target = 2;

        int first = firstOcc(arr,target);
        int last = lastOcc(arr,target);

        System.out.println("First Occurrence: "+first+" Last Occurrence: "+last);
    }
}
