package Arrays.SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main() {
        String s = "abcabcbb";
        HashSet<Character> set = new HashSet<>();

        int winStart = 0;
        int maxLength = 0;
        for (int winEnd = 0; winEnd<s.length(); winEnd++){
            char current = s.charAt(winEnd);
            while (set.contains(current)){
                set.remove(s.charAt(winStart));
                winStart++;
            }
            set.add(current);
            int currentLength = winEnd - winStart+1;

            maxLength = Math.max(maxLength, currentLength);
        }
        System.out.println(maxLength);
    }
}
