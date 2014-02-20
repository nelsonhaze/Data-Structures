/*
 * Node.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Node class that defines a node
 */
package p5;

/**
 *
 * @author Nelson
 */
public class Node <T> {
    
    public T element;
    public Node next;
    
    public Node(T myElement, Node n) {
        element = myElement;
        next = n;
    }
}
    

