package Arrays.TwoPointers;

public class CountMatchingPairs {
    static void main(String[] args) {
        String s= "RACECAR";
        int count = 0 ;
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                count++;
                left++;
                right--;
            }
        }
        System.out.println("Pairs: " +count);
    }
}
