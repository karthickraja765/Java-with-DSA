package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));

    }

    // https://leetcode.com/problems/koko-eating-bananas/
    static int minEatingSpeed0(int[] piles, int h) { //Brute force
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        for (int k = 1; k <= max; k++) {
            int totalHours = 0;

            for (int pile : piles) {
                totalHours += (pile + k - 1) / k; // ceil division
            }

            if (totalHours <= h) {
                return k;
            }
        }

        return -1;
    }

    static int minEatingSpeed(int[] piles, int h) { //Optimal solution: o(n log n)
        int minspeed = 1;
        int maxspeed = 0;

        for (int pile : piles) {
            maxspeed = Math.max(maxspeed, pile); // update the max speed to a max pile
        }

        while (minspeed < maxspeed) {
            int mid = minspeed + (maxspeed - minspeed) / 2;

            if (isSpeedOkay(piles, h, mid)) { // if true, koko is eating at higher speed.
                maxspeed = mid;
            } else { // if false, koko is eating at slower speed.
                minspeed = mid + 1;
            }
        }
        return maxspeed;
    }

    static boolean isSpeedOkay(int[] piles, int h, int speed) {
        int hours = 0;

        for (int pile : piles) {
            hours = hours + (int) Math.ceil((double) pile / speed);
        }
        return hours <= h;
    }
}

