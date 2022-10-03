package com.company.main.stack_using_linked_list;

public class StackUsingLinkedListImpl<E> implements StackUsingLinkedList<E> {

    private Node<E> top;
    private int size;

    @Override
    public void push(E e) {
        Node<E> node = new Node<>(e, top);
        top = node;
        size++;
    }

    @Override
    public void pop() {
        top = top.next;
        size--;
    }

    @Override
    public void top() {
        System.out.println(top);
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public void display() {
        if (!isEmpty()) {
            Node<E> temp = top;
            while (temp != null) {
                System.out.print(temp.item + "->");
                temp = temp.next;
            }
        } else {
            System.out.println("Stack is empty!");
        }
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
