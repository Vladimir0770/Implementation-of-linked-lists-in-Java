package com.company.main.doubly_linked_list;

public class MyDoublyLinkedListImpl<E> implements MyDoublyLinkedList<E> {

    //TODO create method to add the node to specific position

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        if (this.size == 0)
            this.head = this.tail = node;
        else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        size++;
    }

    @Override
    public void addNode(int index, E e) {
        if (index == 0) addFirst(e);

        if (index < size / 2) {
            Node<E> current = head;
            Node<E> next = current.next;
            for (int i = 0; i < size; i++) {
                next = getNodeUtil(index, e, next, i);
            }
        } else {
            Node<E> current = tail;
            Node<E> next = current.next;
            for (int i = size; i > (size / 2); i--) {
                next = getNodeUtil(index, e, next, i);
            }
        }
        size++;
    }

    private Node<E> getNodeUtil(int index, E e, Node<E> next, int i) {
        Node<E> current;
        current = next.prev;
        next = next.next;
        if (index == i) {
            Node<E> node = new Node<>(current, e, next);
            next.prev = node;
            current.next = node;
        }
        return next;
    }

    @Override
    public void addNode(E e) {
        if (head == null) return;

        Node<E> newNode = new Node<>(e);
        newNode.next = tail;
        newNode.prev = tail.prev;
        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;
    }

    private void deleteNode(Node<E> del) {
        if (head == null || del == null)
            return;

        if (head == del)
            head = del.next;

        if (del.next != null)
            del.next.prev = del.prev;

        if (del.prev != null)
            del.prev.next = del.next;

        del = null;
        size--;
    }

    @Override
    public void deleteNodeAtGivenPosition(int position) {
        if (head == null || position <= 0)
            return;

        Node<E> current = head;

        for (int i = 1; current != null && i < position; i++) {
            current = current.next;
        }

        if (current == null)
            return;
        deleteNode(current);
    }

    @Override
    public E search(E e) {
        Node<E> current = head;

        while (!current.item.equals(e)) {
            current = current.next;
        }

        return current.item;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void display() {
        if (isEmpty()) System.out.println("List is empty, nothing to display");

        Node<E> current = head;
        while (current != null) {
            System.out.print(current + "->");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public void reverse() {
        if (isEmpty()) return;

        Node<E> temp = null;
        Node<E> current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
