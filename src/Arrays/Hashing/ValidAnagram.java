package Arrays.Hashing;

import java.util.HashMap;

public class ValidAnagram {
    static void main() {
        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch : t.toCharArray()){
            if (!map.containsKey(ch) || map.get(ch) == 0){
                System.out.println(false);
                return;
            }
            map.put(ch, map.get(ch)-1);
        }
        System.out.println(true);
    }
}
