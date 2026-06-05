package Arrays.TwoPointers;

public class MoveNegativeToEnd {
    static void main(String[] args) {
        int[] arr = {-1, 3, -1, 4, 5, -7};

        int slow=0;

        for (int fast=0; fast<arr.length; fast++){
            if (arr[fast] > 0){
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                 slow++;
            }
        }
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
