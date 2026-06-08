package Arrays.SlidingWindow;

public class MaxSumSubarraySizeK {
    static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 4;

        int windowStart = 0;
        int currentSum = 0;
        int maxSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            currentSum = currentSum + arr[windowEnd];

            if (windowEnd >= k-1){
                maxSum = Math.max(currentSum, maxSum);
                currentSum = currentSum - arr[windowStart];
                windowStart++;
            }
        }
        System.out.println(maxSum);
    }
}