package com.company.main.doubly_linked_list;

/**
 * An interface for doubly linked lists implementation.
 * This interface implements generics programming
 * @author Volodymyr Khivrych
 * @param <E> the type of elements held in this collection
 */

public interface MyDoublyLinkedList<E> {
    /**
     * Inserts the specified element at the specified position, if {@code index == 0} this method
     * delegates the call to {@link #addFirst}
     *
     * @param index position in the collection on which element will be inserted
     * @param e element to be inserted to this list
     * @return {@code true} if collection has been changed after insertion
     * @throws NullPointerException if the specified element is null
     * and this collection does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     * prevents it from being added to this list
     * @throws ClassCastException if the class of the specified element
     * prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index > size()})
     */
    boolean addNode(int index, E e);

    /**
     * Inserts an element as the last element in the list
     * @param e element to be appended to this list
     * @return {@code true} if collection has been changed after insertion
     * @throws NullPointerException if the collection that calls this method is null
     * @throws IllegalArgumentException if some property of this element
     * prevents it from being added to this list
     * @throws ClassCastException if the class of the specified element
     * prevents it from being added to this list
     */
    boolean addNode(E e);

    /**
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index > size()})
     * @throws NullPointerException if the collection that calls this method is null
     */
    E deleteNode(int index);

    /**
     *
     * @param index position in the collection on which element must be found
     * @return a found element from the collection
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index > size()})
     */
    E search(int index);

    /**
     *
     * @return {@code true} if this list contains no elements
     */
    boolean isEmpty();

    /**
     * prints this list to console in readable format
     */
    void display();

    /**
     * Reverses the order of the elements in this list
     */
    void reverse();

    /**
     * Delete all the elements of this collection
     */
    void clear();

    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param e the element to add
     */
    boolean addFirst(E e);


    // TODO create a Node generic class, but it's better to create directly in the class of Impl
    //  if it goes hard, look example in the java.util.LinkedList
}
