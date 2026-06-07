package Arrays.TwoPointers;

public class PairClosestToTarget {
    static void main(String[] args) {
        int[] arr = {1,3,5,8,10};
        int target = 12;

        int minDiff = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length - 1;

        int first = 0;
        int second = 0;

        while (left < right){
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(target - sum);

            if (currentDiff < minDiff){
                minDiff = currentDiff;
                first = arr[left];
                second = arr[right];
            }
            if (sum < target){
                left++ ;
            } else if(sum > target) {
                right-- ;
            } else {
                break;
            }
        }
        System.out.println("CLosest Pair: " + first +","+ second + " with minimum difference: " +minDiff);
    }
}
