package Arrays.Reinforcement.Self;

public class RemoveDuplicates {
    static void main() {
        int[] arr = {1,2,2,3,4,4,5};

        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        for (int i = 0; i <= slow; i++) {
            System.out.println(arr[i]);
        }
    }
}
