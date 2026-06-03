package Arrays.Traversal;

public class CountOccurence {
    static void main(String[] args) {
        int arr[] = {2,4,2,7,2,9};
        int target = 2;
        int occ = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                occ++;
            }
        }
        System.out.println("Occurence of Target: "+target+ " is:" +occ+ " times");
    }
}
