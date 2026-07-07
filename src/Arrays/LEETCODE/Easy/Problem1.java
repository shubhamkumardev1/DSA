package Arrays.LEETCODE.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1 {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)){
                return new int[] {map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    static void main() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
