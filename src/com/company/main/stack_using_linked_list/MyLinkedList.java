package com.company.main.stack_using_linked_list;

/**
 * Interface for future implementations, the current task is to implement stack using Linked List
 * @param <E> Generic type
 */
public interface MyLinkedList<E> {
    /**
     * This method adds element to the end of the collection
     * @param e element which has to be inserted into the collection
     */
    void push(E e);

    /**
     * This method remove the last element in the collection
     */
    void pop();

    /**
     * This method display the last element in the collection
     */
    void peek();

    /**
     * This method just checks if the collection is empty or not
     * @return {@code true} if the collection is empty
     */
    boolean isEmpty();

    /**
     * This method displays all the elements of the collection
     */
    void display();

    /**
     * This method just simply reverse all the elements in the collection
     */
    void reverse();

    /**
     * This method delete all the elements from the collection
     */
    void clear();
}
