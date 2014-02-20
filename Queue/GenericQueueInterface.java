/*
 * GenericQueueInterface.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Generic Queue Interface to be implemented by SLLQueue
 */
package p5;

/**
 *
 * @author Nelson
 */
public interface GenericQueueInterface <T> {
    
         public void enqueue(T t);
         
         public T dequeue( );
         
         public boolean isEmpty();
    
}
