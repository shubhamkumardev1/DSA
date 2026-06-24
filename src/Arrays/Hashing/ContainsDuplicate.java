package Arrays.Hashing;

import java.util.HashSet;

public class ContainsDuplicate {
    static void main(String[] args) {
        int[] arr = {1,2,3,1};

        HashSet<Integer> check = new HashSet<>();

        for (int num : arr){
            if (check.contains(num)){
                System.out.println(true);
                return;
            }
            check.add(num);
        }
        System.out.println(false);
    }
}
