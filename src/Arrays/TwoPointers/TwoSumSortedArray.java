package Arrays.TwoPointers;

public class TwoSumSortedArray {
    static void main(String[] args) {
        int arr[] = {1,2,3,5,5,6,7};
        int target = 11;

        int left = 0;
        int right = arr.length-1;

        boolean found = false;

        while(left < right){
            int sum = arr[left]+arr[right];

            if (sum == target){
                found = true;
                break;
            }
            if(sum < target){
                left++;
            } else{
                right--;
            }
        }
        System.out.println(found);
    }
}
