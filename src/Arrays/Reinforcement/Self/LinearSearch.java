package Arrays.Reinforcement.Self;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {

        // Traverse the entire array
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches target
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 23, 89, 34};
        int target = 23;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
