package Arrays.TwoPointers;

public class RemoveDupliSortedArray {
    static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};

        if (arr.length == 0){
            System.out.println("Empty array");
            return;
        }
        int slow=0;

        for (int fast=1; fast < arr.length; fast++){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        for (int i=0; i <= slow; i++){
            System.out.println(arr[i]);
        }
    }
}
