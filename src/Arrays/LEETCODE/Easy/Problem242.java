package Arrays.LEETCODE.Easy;

public class Problem242 {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        if (s.length() != t.length())
            return false;

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            freq[ch - 'a']--;
        }
        for(int count : freq){
            if (count != 0)
                return false;
        }
        return true;
    }

    public static void main() {
        Problem242 obj = new Problem242();

        System.out.println(obj.isAnagram("anagram", "nagaram"));

    }
}
