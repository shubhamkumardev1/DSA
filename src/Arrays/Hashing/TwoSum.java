package Arrays.Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    static void main() {
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length;i++){

            int required = target - arr[i];
            if (map.containsKey(required)){
                System.out.println(true);
                System.out.println("Required array elements to reach target are: "+arr[i]+" and "+arr[i-1]);
                return;
            }
            map.put(arr[i],i);
        }
        System.out.println(false);
    }
}
