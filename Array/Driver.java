
package p1;
/** 
 * Nelson Hazelbaker
 * Data Structures and Algorithms
 * Binary Search Program
 */
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
      
      int n;
      int j = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter n:");
      n = in.nextInt();
      {
        int [] myArray = new int [65000];
        for(int i= 0; i< 65000; i++){
            myArray[i] =  i ;
        }
        
        while(j< n){
        j++;
        int targetInt = (int)(3 + Math.random()*65000);
        System.out.println(BinarySearch.search(myArray, 1, 65000, targetInt));
        }  
            }}
}
