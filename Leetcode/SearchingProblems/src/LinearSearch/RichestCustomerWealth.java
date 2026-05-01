package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));

    }

    // Leetcode: https://leetcode.com/problems/richest-customer-wealth/
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            int personsum = 0;
            for (int personsbankacc = 0; personsbankacc < accounts[person].length; personsbankacc++) {
                personsum += accounts[person][personsbankacc];
            }
            if (personsum > max) {
                max = personsum;
            }
        }
        return max;
    }
}
