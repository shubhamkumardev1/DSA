package Arrays.LEETCODE.Easy;

public class Problem724 {
    public static int pivot(int[] arr){
        int totalSum = 0;
        int leftSum = 0;

        for (int num : arr){
            totalSum += num;
        }
        for (int i=0; i < arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (rightSum == leftSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    static void main() {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot at index: " +pivot(arr));
    }
}
