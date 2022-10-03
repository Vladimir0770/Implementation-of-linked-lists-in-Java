package com.company.main.stack_using_linked_list;

public class StackUsingLinkedListImpl<E> implements StackUsingLinkedList<E> {

    private Node<E> top;
    private int size;

    @Override
    public void push(E e) {
        if (isEmpty()) {
            top = new Node<>(e, null);
        } else {
            Node<E> node = new Node<>(e, top);
            top = node;
        }
        size++;
    }

    @Override
    public void pop() {
        top = top.next;
        size--;
    }

    @Override
    public void top() {

    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // TODO implement method only using the stack methods
    @Override
    public void display() {

    }

    // TODO implement method only using the stack methods
    @Override
    public void reverse() {

    }

    @Override
    public void clear() {
        top = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
