/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * ListNode Class for Programming Assignment 4
 * 
 */
package p4;

/**
 *
 * @author Nelson Hazelbaker
 */
public class ListNode {
    
    public String element;
    public ListNode next;
    
    public ListNode(String myElement) {
        this(myElement, null);
    }

    public ListNode(String myElement, ListNode n) {
        element = myElement;
        next = n;
    }
}
