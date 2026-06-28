package Arrays.BinarySearch;

public class Search2DMatrix {
    static void main() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 16;
        int answer = -1;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows*cols - 1;

        while (left <= right){
            int mid = left + (right-left)/2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target){
                answer = mid;
                break;
            } else if (matrix[row][col] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Target found at: "+answer);
    }
}
