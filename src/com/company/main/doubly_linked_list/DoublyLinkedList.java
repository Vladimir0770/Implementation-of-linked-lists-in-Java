package com.company.main.doubly_linked_list;

/**
 * An interface for doubly linked lists implementation.
 * This interface implements generics programming
 * @author Volodymyr Khivrych
 * @param <E> the type of elements held in this collection
 */

public interface DoublyLinkedList<E> {
    /**
     * Inserts the specified element at the specified position, if {@code index == 0} this method
     * delegates the call to {@link #addFirst}
     *
     * @param position in the collection on which element will be inserted
     * @param e element to be inserted to this list
     * @throws NullPointerException if the specified element is null
     * and this collection does not permit null elements
     * @throws IllegalArgumentException if some property of this element
     * prevents it from being added to this list
     * @throws ClassCastException if the class of the specified element
     * prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index > size()})
     */
    void addNode(int position, E e);

    /**
     * Inserts an element as the last element in the list
     * @param e element to be appended to this list
     * @throws NullPointerException if the collection that calls this method is null
     * @throws IllegalArgumentException if some property of this element
     * prevents it from being added to this list
     * @throws ClassCastException if the class of the specified element
     * prevents it from being added to this list
     */
    void addNode(E e);

    /**
     *
     * @param position of the node which must be removed
     * @throws NullPointerException if the collection that calls this method is null
     */
    void deleteNodeAtGivenPosition(int position);

    /**
     *
     * @param e element in the collection which must be found
     * @return a found element from the collection
     */
    E search(E e);

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
    void addFirst(E e);

    int getSize();
    // TODO create a Node generic class, but it's better to create directly in the class of Impl
    //  if it goes hard, look example in the java.util.LinkedList
}
