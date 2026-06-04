package Arrays.TwoPointers;

public class MirrorString {
    static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "OLLEH";
        int left = 0;
        int right = s2.length() - 1;

        boolean result = true;
        for(int i = left; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(right)){
                left++;
                right--;
            } else {
                result = false;
                System.out.println("Not Mirror");
            }
        }
        if(result){
            System.out.println("Mirrored String");
        }
    }
}
