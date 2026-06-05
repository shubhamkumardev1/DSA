package Arrays.TwoPointers;

public class CountPairsTargetSum {
    static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 9;

        int left= 0;
        int right = arr.length-1;

        int count = 0;

        while(left<right){
            int sum =  arr[left]+arr[right];
            if(sum==target){
                count++;
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
}
