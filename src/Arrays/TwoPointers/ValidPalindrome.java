package Arrays.TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "MANBAM";
        int left = 0;
        int right = s.length() -1;
        boolean palindrome = true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                palindrome = false;
                break;
            }
            left ++;
            right--;
        }
        if(palindrome){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}