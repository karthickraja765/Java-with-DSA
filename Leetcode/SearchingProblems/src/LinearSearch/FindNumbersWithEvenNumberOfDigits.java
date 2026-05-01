package LinearSearch;

public class FindNumbersWithEvenNumberOfDigits {

    // Leetcode: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    // submitted answer
    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (evenno(num)){
                answer++;
            }
        }
        return answer;
    }
    int digiCount(int num) {
        int countofelement = 0;
        if (num < 0){
            num = num * -1;
        }
        while (num > 0) {
            countofelement++;
            num /= 10;
        }
        //instead of using the above while loop. We can use the maths shortcut below
        //return (int)(Math.log10(num))+1;
        return countofelement;
    }
    boolean evenno(int num) {
        int noofdigits = digiCount(num);{
            if ( noofdigits % 2 == 0) {
                return true;
            }
            return false;
        }
    }
}