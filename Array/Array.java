
package p2;

/** 
 * @author Nelson Hazelbaker
 * Programming Exercises 2.19 and 2.20
 * (Code Modeled after guide in textbook)
 */
public class Array {

    private int next;
    private int size;
    private StudentListings[] data;

    public Array() {
        next = 0;
        size = 100;
        data = new StudentListings[size];
    }//end of constructor

    /**
     * insert method to store a deep copy of the node
     * @param newNode
     * @returns true as long as there is sufficient memory
     */
    
    public boolean insert(StudentListings newNode) {
        if (next <= size){
        data[next] = newNode.deepCopy();
        }
        if (data[next] == null){
            return false;
        }
        next = next + 1;
        return true;
    }// end of insert method
    
    /**
     * fetch method to access the node using a sequential search
     * @param targetKey
     * @returns node if it is found
     */

    public StudentListings fetch(String targetKey) {
        StudentListings node;
        StudentListings temp;
        int i = 0;
        while (i < next && !(data[i].compareTo(targetKey) == 0)) {
            i++;
        }
        if (i == next){
            return null;
        }
        node = data[i].deepCopy();
        if (i != 0){
            temp = data[i - 1];
            data[i - 1] = data[i];
            data[i] = temp;
        }
        return node;
    } // end of fetch method
    
    /**
     * delete method uses sequential search to access the node
     * @param targetKey
     * @return true if the node was found and deleted
     */

    public boolean delete(String targetKey) {// access the node using a sequential search
        int i = 0;
        while (i < next && !(data[i].compareTo(targetKey) == 0)) {
            i++;
        }
        if (i == next){
            return false;
        }
        data[ i] = data[ next - 1];
        data[next - 1] = null;
        next = next - 1;
        return true;
    }//end of the delete method
    
    /**
     * update method changes the target key to a new node
     * @param targetKey
     * @param newNode
     * @return true if node was found and updated
     */

    public boolean update(String targetKey, StudentListings newNode) {
        if (delete(targetKey) == true && insert(newNode) == true){
            return true;
        }  else {
            return false;
        }
    }// end of update method
}//end of class Array
