/*
 * Driver.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Driver exercises the Queue implemented as a double ended Singly linked list.
 * 
 */
package p5;

/**
 *
 * @author Nelson
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instantiate a new queue with type Integer
        GenericQueueInterface<Integer> q = new SLLQueue<>();
        q.enqueue(1);
        //head = [1]->null
        //tail = [1]->null
        q.enqueue(2);
        //head = [1]->null
        //tail = [1]->[2]->null
        //=> head = [1]->[2]->null
        //tail = [2]
        q.enqueue(3);
        //head = [1]->[2]->null
        //tail = [2]->[3]->null
        //=> head = [1]->[2]->[3]->null
        //tail = [3]

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        //q is dequeued in FIFO format.
        }
    }
}
