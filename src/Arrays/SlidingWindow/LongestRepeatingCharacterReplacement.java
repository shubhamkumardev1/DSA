package Arrays.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        HashMap<Character, Integer> freq = new HashMap<>();

        int winSt = 0;
        int maxF = 0;
        int maxL = 0;

        for (int winE = 0;winE < s.length(); winE++) {
            char current = s.charAt(winE);
            freq.put(current, freq.getOrDefault(current, 0) + 1);
            maxF = Math.max(maxF, freq.get(current));
            int windowS = winE - winSt + 1;
            while (windowS - maxF > 1) {
                char left = s.charAt(winSt);
                freq.put(left,freq.get(left)-1);
                winSt++;
                windowS = winE - winSt + 1;
            }
            maxL = Math.max(maxL, windowS);
        }
        System.out.println(maxL);
    }
}