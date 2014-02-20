/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * StackSLL Class for Programming Assignment 4
 * 
 */
package p4;

/**
 *
 * @author Nelson Hazelbaker
 */
public class StackSLL implements Stack {
    
    private ListNode top;
    
    public StackSLL() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String el) {
        top = new ListNode(el, top);
    }

    public String pop() {
        String topItem = top.element;
        top = top.next;
        return topItem;
    }
}
