package com.company.main.stack_using_linked_list;

public class StackUsingLinkedListImpl<E> implements StackUsingLinkedList<E> {

    private Node<E> top;
    private int size;

    @Override
    public void push(E e) {
        top = new Node<>(e, top);
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
            System.out.println();
        } else {
            System.out.println("Stack is empty!");
        }
    }

    @Override
    public void reverse() {
        Node<E> prev = null;
        Node<E> current = top;
        Node<E> next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
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
