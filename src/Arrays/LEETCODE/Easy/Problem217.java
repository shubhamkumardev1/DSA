package Arrays.LEETCODE.Easy;

import java.util.HashSet;

public class Problem217 {
    public static int duplicate(int[]arr){
        HashSet<Integer> seen = new HashSet<>();

        for (int n : arr){
            if (seen.contains(n)){
                return n;
            }
            seen.add(n);
        }
        return -1;
    }
    static void main() {
        int[] arr = {1,2,3,1};
        System.out.println("Duplicate of " +duplicate(arr)+ " exists" );
    }
}
