package com.company.main.doubly_linked_list;

public class Node<E> {
    E item;
    E prev;
    E next;

    public Node(E item, E prev, E next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }
}
