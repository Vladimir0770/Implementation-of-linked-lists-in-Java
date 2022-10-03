package com.company.main;

import com.company.main.doubly_linked_list.MyDoublyLinkedList;
import com.company.main.doubly_linked_list.MyDoublyLinkedListImpl;
import com.company.main.stack_using_linked_list.StackUsingLinkedList;
import com.company.main.stack_using_linked_list.StackUsingLinkedListImpl;

public class Main {
    public static void main(String[] args) {
//        MyDoublyLinkedList<Integer> numbers = new MyDoublyLinkedListImpl<>();
//
//        numbers.addFirst(3);
//        numbers.addFirst(0);
//        numbers.addNode(6);
//        numbers.addNode(7);
//        numbers.addNode(8);
//        numbers.addFirst(1);
//        numbers.addFirst(2);
//        numbers.addFirst(5);
//        numbers.display();
//        numbers.deleteNodeAtGivenPosition(numbers.getSize());
//        numbers.display();
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedListImpl<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getSize());
        stack.display();
    }
}
