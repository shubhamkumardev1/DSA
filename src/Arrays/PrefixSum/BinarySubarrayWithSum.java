package Arrays.PrefixSum;

import java.util.HashMap;

public class BinarySubarrayWithSum {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1};
        int goal = 2;

        HashMap<Integer, Integer> map =
                new HashMap<>();

        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : arr) {

            currentSum += num;

            if (map.containsKey(currentSum - goal)) {

                count += map.get(currentSum - goal);
            }

            map.put(
                    currentSum,
                    map.getOrDefault(currentSum, 0) + 1
            );
        }

        System.out.println(count);
    }
}