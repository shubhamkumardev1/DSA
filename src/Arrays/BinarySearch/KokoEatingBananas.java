package Arrays.BinarySearch;

public class KokoEatingBananas {

    static void main() {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int left = 1;
        int right = 0;
        for (int pile : piles){
            right = Math.max(pile,right);
        }

        int answer = right;
        while (left <= right){
            int mid = left + (right-left)/2;
            int hours = calculateHours(piles,mid);

            if (hours <= h){
                answer = mid;

                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Minimum hours: "+answer);
    }
    static int calculateHours(int[] piles, int speed){
        int totalH = 0;

        for (int pile : piles){
            totalH= totalH + (pile + speed-1)/speed;
        }
        return totalH;
    }
}