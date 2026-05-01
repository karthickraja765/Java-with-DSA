package BinarySearch;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles, h));

    }

    static int minEatingSpeedBrute(int[] piles, int h) { //Brute force
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

    static int minEatingSpeed(int[] piles, int h) { //Optimal solution
        int minspeed = 0;

        int maxspeed = 0;
        for (int pile : piles) {
            maxspeed = Math.max(maxspeed, pile);
        }

        while (minspeed < maxspeed) {
            int mid = minspeed + (maxspeed - minspeed) / 2;

            if (isSpeedOkay(piles, h, mid)) {
                maxspeed = mid;
            } else {
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

