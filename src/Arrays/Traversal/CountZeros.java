package Arrays.Traversal;

public class CountZeros {
    static void main(String[] args) {
        int arr[] = {0,4,0,7,2,0,9, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Total number of zeros in array: "+count);
    }
}
