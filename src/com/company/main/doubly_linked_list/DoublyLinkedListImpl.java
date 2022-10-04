package com.company.main.doubly_linked_list;

public class DoublyLinkedListImpl<E> implements DoublyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    @Override
    public void addFirst(E e) {
        Node<E> node = new Node<>(e);
        if (size == 0)
            head = tail = node;
        else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    @Override
    public void addNode(int position, E e) {
        if (position == 0) addFirst(e);

        Node<E> current;
        if (position <= size / 2) {
            current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > position - 1; i--) {
                current = current.prev;
            }
        }
        utilMethodForInsertNodeInTheMiddle(current, e);
        size++;
    }

    private void utilMethodForInsertNodeInTheMiddle(Node<E> currentNode, E itemForNewNode) {
        Node<E> newNode = new Node<>(itemForNewNode);
        Node<E> currentPrevTmp = currentNode.prev;
        currentNode.prev = newNode;
        newNode.next = currentNode;
        newNode.prev = currentPrevTmp;
        currentPrevTmp.next = newNode;
    }

    // This implementation add node in the end of the collection
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

    // util method for method deleteNodeAtGivePosition(int position)
    private void deleteNode(Node<E> del) {
        if (head == null || del == null)
            return;

        if (head == del)
            head = del.next;

        if (del.next != null)
            del.next.prev = del.prev;

        if (del.prev != null)
            del.prev.next = del.next;

        size--;
    }

    @Override
    public void deleteNodeAtGivenPosition(int position) {
        if (head == null || position <= 0)
            return;

        Node<E> current;
        if (position <= size / 2) {
            current = head;
            for (int i = 1; current != null && i < position; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; current != null && i > position - 1 ; i--) {
                current = current.prev;
            }
        }
        if (current == null) return;
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
