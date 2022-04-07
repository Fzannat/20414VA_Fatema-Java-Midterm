package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};

        System.out.println("The missing number is: " + findMissingNumbers(array));
    }
    public static int findMissingNumbers(int[] nums) {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
