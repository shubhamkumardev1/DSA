package Arrays.SlidingWindow;

public class MaximumNumberVowelsSubstringLengthK {
    static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        String vowels = "aeiou";

        int winStart = 0;
        int currentVowels = 0;
        int maxVowels = 0;

        for (int winEnd = 0; winEnd < s.length(); winEnd++) {
            if (vowels.indexOf(s.charAt(winEnd)) != -1) {
                currentVowels++;
            }
            if (winEnd >= k - 1) {
                maxVowels = Math.max(currentVowels, maxVowels);
                if (vowels.indexOf(s.charAt(winStart)) != -1) {
                    currentVowels--;
                }
                winStart++;
            }
        }
        System.out.println(maxVowels);
    }
}
