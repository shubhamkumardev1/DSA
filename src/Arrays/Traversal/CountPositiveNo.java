package Arrays.Traversal;

public class CountPositiveNo {
    static void main(String[] args) {
        int arr[] = {-2,5,-7,8,1,-3};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            }  else {
                negative++;
            }
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: " +negative);
    }
}
