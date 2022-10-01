package com.company.main.doubly_linked_list;

public class Node<E> {
    E item;
    Node<E> prev;
    Node<E> next;

    public Node(Node<E> prev, E item, Node<E> next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }

    public Node(E item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
