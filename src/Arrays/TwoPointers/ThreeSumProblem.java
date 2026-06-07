package Arrays.TwoPointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    static void main() {
        int[] arr = {-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        for (int i=0; i < arr.length-2; i++){
            // duplicate handling
            if (i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int target = -arr[i]; // fixed one
            int left = i + 1; // two pointer
            int right = arr.length-1;

            while (left < right){
                int sum = arr[left] + arr[right];
                if (sum == target){
                    result.add(
                            List.of(
                                    arr[i],
                                    arr[left],
                                    arr[right]));

                    left++;
                    right--;
                    // duplicate handling for left/right values
                    while (left<right && arr[left] == arr[left-1]){
                        left++;
                    }
                    while (left<right && arr[right] == arr[right+1]){
                        right--;
                    }
                } else if (sum < target){
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(result);
    }
}
