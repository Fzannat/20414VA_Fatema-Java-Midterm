package math_problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class FindLowestDifference {

    /** INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static <Sort> void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};


        System.out.println("\n\nlowest number that is not shared is: " + getLowestNumber(array1, array2));
    }



    static int getLowestNumber(int[] array1, int[] array2) {
        //Sorting first array

        int temp1;
        for (int i = 0; i < (array1.length); i++) {
            for (int j = (i+1); j < (array1.length); j++) {
                if (array1[i] > array1[j]) {
                    temp1 = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp1;
                }
            }

            System.out.print("\t" + array1[i]);
        }

        System.out.println("\n");

        //Sorting second array
        int temp2;
        for (int i = 0; i < (array2.length); i++) {
            for (int j = (i+1); j < (array2.length); j++) {
                if (array2[i] > array2[j]) {
                    temp2 = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp2;
                }
            }
            System.out.print("\t" + array2[i]);
        }

        //Comparing Array1 and Array2
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < array2[i]) {
                result = array1[i];
                break;
            } else if (array2[i] < array1[i]) {
                result =  array2[i];
                break;
            }

        }
        return result;
    }

}



