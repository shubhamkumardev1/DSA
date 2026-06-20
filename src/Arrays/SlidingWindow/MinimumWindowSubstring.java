package Arrays.SlidingWindow;

import java.net.Inet4Address;
import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

       HashMap<Character, Integer> targetMap = new HashMap<>();
       HashMap<Character, Integer> winMap = new HashMap<>();

       for (char ch : t.toCharArray()){
           targetMap.put(
                   ch,
                   targetMap.getOrDefault(ch,0)+1);
       }
       int winstart = 0;
       int minlength = Integer.MAX_VALUE;
       int startIndex = 0;
       int matched = 0;

       for (int windEnd = 0;windEnd<s.length();windEnd++){
           char current = s.charAt(windEnd);
           winMap.put(current, winMap.getOrDefault(current,0)+1);

           if (targetMap.containsKey(current) &&
                   winMap.get(current).intValue() == targetMap.get(current).intValue()){
               matched++;
           }
           while (matched == targetMap.size()){
               int winsize = windEnd - winstart + 1;
               if ( winsize < minlength){
                   minlength=winsize;
                   startIndex=winstart;
               }
               char leftChar = s.charAt(winstart);
               winMap.put(leftChar,winMap.get(leftChar)-1);

               if (targetMap.containsKey(leftChar) &&
                       winMap.get(leftChar) < targetMap.get(leftChar)){
                   matched--;
               }
               winstart++;
           }
       }
       if (minlength == Integer.MAX_VALUE){
           System.out.println(" ");
       } else {
           System.out.println(
                   s.substring(
                           startIndex,
                           startIndex + minlength));
       }
    }
}