package Arrays.Reinforcement.Self;

public class twoSum {
    static void main() {
        int[] arr = {1,2,3,5,5,6,7};
        int target = 11;

        int left = 0;
        int right = arr.length-1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                System.out.println("Found at index: " + left+" and " +right);
                break;
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }

    }
}
