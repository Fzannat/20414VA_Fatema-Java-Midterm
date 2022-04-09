package math_problems;

import java.util.Scanner;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        //Scanner object for capturing the user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        //Stored the entered value in variable
        int num = scanner.nextInt();
        //Called the user defined function fact
        int recursionFactorial = recursion(num);
        int iterationFactorial = iteration(num);
        System.out.println("Factorial using recursion method of entered number is: "+ recursionFactorial);
        System.out.println("Factorial using iteration method of entered number is: "+ iterationFactorial);
    }
    static int recursion(int n) {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = recursion(n-1)* n;
        return output;
    }
    static int iteration(int n)
    {
        int outPut = 1, i;
        for (i = 2; i <= n; i++)
            outPut *= i;
        return outPut;
    }


}



