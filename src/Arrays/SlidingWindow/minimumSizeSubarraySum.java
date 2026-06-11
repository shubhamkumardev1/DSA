package Arrays.SlidingWindow;

public class minimumSizeSubarraySum {
    static void main() {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int winStart = 0;
        int minLength = Integer.MAX_VALUE;
        int sum =0;

        for (int winEnd =0; winEnd < arr.length; winEnd++){
            sum += arr[winEnd];
            int windowSize = winEnd - winStart + 1;
            while (sum >= target){
                minLength = Math.min(minLength, windowSize);
                sum -= arr[winStart];
                winStart++;
                windowSize = winEnd -winStart+1;
            }
        }
        System.out.println(minLength);
    }
}
