package com.company.main.stack_using_linked_list;

public class Node<E> {
    E item;
    Node<E> next;

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    public Node() {}

    @Override
    public String toString() {
        return item.toString();
    }
}
