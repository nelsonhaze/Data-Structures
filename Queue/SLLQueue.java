/*
 * SLLQueue.java
 * 
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Queue implemented as a double ended singly linked list using Generics
 */
package p5;

/**
 *
 * @author Nelson
 */
public class SLLQueue<T> implements GenericQueueInterface<T> {

    /**
     * Initialize head (front) node and tail (rear) node
     */
    private Node<T> head = null;
    private Node<T> tail = null;

    /**
     * Pre-conditions: Data is homogenous to the data set Post-condition:
     * Enqueue the node at the tail of the queue
     *
     * @param data
     * @return
     */
    @Override
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Pre-conditions: There exists an element in the List Post-condition:
     * Dequeue at the head of the queue
     *
     * @param element
     * @return
     */
    @Override
    public T dequeue() {
        if (isEmpty()) {
         //Do nothing
        }{
            T element = head.element;
            head = head.next;
            return element;
        }
    }


    /**
     * Checks if the queue is empty
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
