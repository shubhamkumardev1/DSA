package Arrays.TwoPointers;

public class TrappingRainWater {
    static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int left = 0;
        int right = arr.length-1;
        int leftMax =0;
        int rightMax =0;
        int water =0;

        while (left < right){
            if (arr[left] < arr[right]){
                if (arr[left] >= leftMax){
                    leftMax = arr[left];
                } else {
                    water = water + leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax){
                    rightMax = arr[right];
                } else {
                    water = water + rightMax - arr[right];
                }
                right--;
            }
        }
        System.out.println(water);
    }
}
