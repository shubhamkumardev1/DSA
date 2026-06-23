package Arrays.PrefixSum;

public class PivotIndex {
    static void main() {
        int[] arr = {1,7,3,6,5,6};
        int totalSum = 0;
        for (int num : arr){
            totalSum += num;
        }
        int leftSum=0;
        for (int i=0; i<arr.length;i++){
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum){
                System.out.println("Pivot Index: " +i);
            }

            leftSum += arr[i];
        }
    }
}
