package com.company.main;

import com.company.main.doubly_linked_list.MyDoublyLinkedList;
import com.company.main.doubly_linked_list.MyDoublyLinkedListImpl;

public class Main {
    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> integers = new MyDoublyLinkedListImpl<>();
        integers.addNode(69);
        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addFirst(4);
        integers.addFirst(5);
        integers.addNode(44);
        integers.addNode(55);
        integers.addNode(66);
        integers.addFirst(6);
        integers.addFirst(7);

        integers.display();


        System.out.println("After deletion");
        integers.deleteNodeAtGivenPosition(9);
        integers.display();

        System.out.println("After reverse");
        integers.reverse();
        integers.display();

        System.out.println("After clearance");
        integers.clear();
        integers.display();
    }
}
