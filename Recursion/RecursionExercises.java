/*
 * RecursionExercises.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Recursion Exercises from the Book.
 */
package p7;

/**
 *
 * @author Nelson
 */
public class RecursionExercises {

    /**
     * Exercise 14 
     * Pre-conditions: A and B are integers 
     * Post-condition: A is greater than B
     *
     * @param a, b
     * @return Sum of integers from a to b
     */
    public int exercise14(int a, int b) {
        return a == b ? 0 : a + exercise14(a - 1, b);
    }
   
    
    
    /* Exercise 15
     * Pre-condition: An array of characters already exists and the input values
     * are valid.
     * Post-Conditon: Values given do not equal eachother.
     * 
     * @param start, end
     * @return Array of characters(c[])
     */
    private String s = "This is my Test String";
    private char[] c = s.toCharArray();
    private int i = 0;
    private int j = c.length - 1;

    public char[] exercise15(int start, int end) {
        if (start == end) {
            return c;
        } else {
            c[i] = c[start];
            i++;
        }
        return c = exercise15(start + 1, end);
    }

    
    /**
     * Exercise 16 Pre-conditions: Array is already sorted and key is a valid
     * entry. Post-condition: If min is greater than max return -1(NOT_FOUND)
     *
     * @param Comparable[] sortedArray, aKey
     * @return Index of key or -1 if not found
     */
    public static int exercise16(Comparable[] sortedArray, Comparable aKey) {
        return exercise16(sortedArray, aKey, 0, sortedArray.length - 1);
    }
    public static int NOT_FOUND = -1;

    private static int exercise16(Comparable[] sortedArray, Comparable aKey, int min, int max) {
        if (min > max) {
            return NOT_FOUND;
        }
        int mid = (min + max) / 2;

        if (sortedArray[mid].compareTo(aKey) < 0) {
            return exercise16(sortedArray, aKey, mid + 1, max);
        } else if (sortedArray[mid].compareTo(aKey) > 0) {
            return exercise16(sortedArray, aKey, min, mid - 1);
        } else {
            return mid;
        }
    }

    /**
     * Pre-conditions: A and B are integers Post-condition: B is not equal to 0
     *
     * @param a, b
     * @return Product of a and b
     */
    public int exercise17(int a, int b) {
        return b == 0 ? 0 : a + exercise17(a, b - 1);
    }
}
