package Arrays.Traversal;

public class CountEven {
    public static void main(String[] args) {
        int arr[] = {2,7,8,11,14,5};
        int count = 0;
        int largeEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                if (arr[i] > largeEven){
                    largeEven = arr[i];
                }
            }
        }
        System.out.println("Count of Even: "+count);
        System.out.println("Largest Even among all: "+largeEven);
    }
}
