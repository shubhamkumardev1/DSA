package Arrays.SlidingWindow;

import java.util.HashMap;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> windowMap = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            targetMap.put(
                    ch,
                    targetMap.getOrDefault(ch, 0) + 1
            );
        }

        int windowStart = 0;

        for (int windowEnd = 0;
             windowEnd < s2.length();
             windowEnd++) {

            char current = s2.charAt(windowEnd);

            windowMap.put(
                    current,
                    windowMap.getOrDefault(current, 0) + 1
            );

            if (windowEnd - windowStart + 1 > s1.length()) {

                char leftChar =
                        s2.charAt(windowStart);

                windowMap.put(
                        leftChar,
                        windowMap.get(leftChar) - 1
                );

                if (windowMap.get(leftChar) == 0) {
                    windowMap.remove(leftChar);
                }

                windowStart++;
            }

            if (windowMap.equals(targetMap)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}