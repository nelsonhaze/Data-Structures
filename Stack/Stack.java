/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Stack Interface for Programming Assignment 4
 * 
 */
package p4;

/**
 *
 * @author Nelson Hazelbaker
 */
public interface Stack {

    void push(String el);

    public String pop();

    boolean isEmpty();
}