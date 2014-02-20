/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Stack Class for Programming Assignment 3
 * 
 */
package p3;

/**
 *
 * @author Nelson Hazelbaker
 */
public class Stack {

    private String[] data;
    private int top;
    private int size;

    public Stack() {
        top = -1;
        size = 100;
        data = new String[100];
    }

    public Stack(int n) {
        top = -1;
        size = n;
        data = new String[n];
    }

    public boolean push(String el) {
        if (top == size - 1) {
            return false;
        } else {
            top = top + 1;
            data[top] = el;
            return true;
        }
    }

    public String pop() {
        int topLocation;
        if (top == -1) {
            return null;
        } else {
            topLocation = top;
            top = top - 1;
            return data[topLocation];
        }
    }

    public boolean empty() {
        return top == -1;
    }

    public void showAll() {
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].toString());
        }
    }
}