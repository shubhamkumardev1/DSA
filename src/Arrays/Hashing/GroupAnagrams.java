package Arrays.Hashing;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};


        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}