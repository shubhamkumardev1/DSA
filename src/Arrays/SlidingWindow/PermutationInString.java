package Arrays.SlidingWindow;
import java.util.Arrays;

public class PermutationInString {

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        int k = s1.length();

        char[] target = s1.toCharArray();
        Arrays.sort(target);

        boolean found = false;

        for (int i = 0; i <= s2.length() - k; i++) {

            String current = s2.substring(i, i + k);

            char[] arr = current.toCharArray();
            Arrays.sort(arr);

            if (Arrays.equals(target, arr)) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}