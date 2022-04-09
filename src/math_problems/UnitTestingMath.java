package math_problems;

public class UnitTestingMath {

    /**
     * Use this class to unit test all of the class within this package
     */

    public static void main(String[] args) {

    //Pattern
        System.out.println("\nPattern");
        Pattern.getPattern();

    //factorial
        Factorial.recursion(5);
        System.out.println("\n\nFactorial using recursion: " + Factorial.recursion(5));
    }
}
