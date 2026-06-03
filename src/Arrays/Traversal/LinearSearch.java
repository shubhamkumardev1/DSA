package Arrays.Traversal;

public class LinearSearch {
    static void main(String[] args) {
        int arr[] = {5,9,2,7,11};
        int target = 7;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target: "+arr[i]+ " found at Index: " + i);
            }
        }
    }
}
