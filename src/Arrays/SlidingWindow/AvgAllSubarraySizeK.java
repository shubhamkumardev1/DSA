package Arrays.SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AvgAllSubarraySizeK {
    static void main() {
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k = 5;
        int currentSum = 0;
        List<Double> avg = new ArrayList<>();
        int winStart = 0;

        for (int winEnd = 0; winEnd < arr.length; winEnd++){
            currentSum += arr[winEnd];

            if (winEnd >= k-1){
                double average = (double) currentSum/k;
                avg.add(average);
                currentSum -= arr[winStart];
                winStart++;
            }
        }
        System.out.println(avg);
    }
}
