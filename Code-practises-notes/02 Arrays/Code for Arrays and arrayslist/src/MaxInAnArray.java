public class MaxInAnArray {
    public static void main(String[] args) {
        int[] arr = {23, 45, 234, 12, 534};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int max = 0; // you can also initialise max to minimum value in the array, for that use this line -> Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
