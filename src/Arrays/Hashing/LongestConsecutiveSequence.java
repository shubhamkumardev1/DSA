package Arrays.Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    static void main() {
        int[] arr = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int maxLength = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)){
                int currentlength = 1;
                while (set.contains(num + 1)) {
                    num++;
                    currentlength++;
                }
                maxLength = Math.max(currentlength,maxLength);
            }
        }
        System.out.println(maxLength);
    }
}
