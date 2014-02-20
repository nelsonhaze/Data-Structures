
package p1;
/** 
 * Nelson Hazelbaker
 * Data Structures and Algorithms
 * Binary Search Program
 */
public class BinarySearch {
    public static int search(int[] sorted, int min, int max, int key) {
    int count = 0;
    while (min < max) {
        count++;
        int mid = (min + max) / 2;        // Compute mid point.
        if (key < sorted[mid]) {
            max = mid;                    // repeat search in bottom half.
        } else if (key > sorted[mid]) {
            min = mid + 1;                // Repeat search in top half.
        } else {
            return mid;                   // Found it. return position
        }
    }
    return -(min + 1);                    // Failed to find key
}
}
