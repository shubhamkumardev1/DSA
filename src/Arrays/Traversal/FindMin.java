package Arrays.Traversal;

public class FindMin {
    static void main(String[] args) {
        int arr[] = {8,2,11,4,15,2};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("min = " + min);
    }
}
