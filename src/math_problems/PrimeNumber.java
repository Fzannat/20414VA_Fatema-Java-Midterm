package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        primeNumber(1000000);

    }
    public static void primeNumber(int num){
        boolean prime[] = new boolean[num+1];

        for (int i = 2; i <= num; i++ ){
            prime[i] = true;
        }

        for (int j = 2; j <= Math.sqrt(num); j++){
            if (prime[j]){
                for (int k = j; k*j <= num; k++){
                    prime[k*j] = false;
                }
            }
            for (int p =2; p<=num; p++){
                if (prime[p]){
                    System.out.print(p + " ");
                }
            }
        }
    }

}
