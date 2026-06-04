package Arrays.TwoPointers;

public class ValidPalindrome2 {
    static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static void main(String[] args) {
        String s = "abcd";
        int left = 0;
        int right = s.length() - 1;

        boolean result = true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                result = isPalindrome(s, left +1, right) ||
                        isPalindrome(s, left, right - 1);
                break;
            }
            left++;
            right--;
        }
        System.out.println(result);
    }
}
