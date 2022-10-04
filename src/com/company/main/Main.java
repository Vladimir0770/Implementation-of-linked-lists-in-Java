package com.company.main;

import com.company.main.doubly_linked_list.DoublyLinkedList;
import com.company.main.doubly_linked_list.DoublyLinkedListImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to convenient menu for selecting operations!!!\n" +
                "Empty Doubly Linked List is already created for you!");
        Thread.sleep(1500);

        // Initialization of the collection and scanner
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList<Integer> dll = new DoublyLinkedListImpl<>();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" +
                "\nShort info how to use this console:\n");
        Thread.sleep(1500);
        System.out.println("At the beginning you will fill your collection with elements.\n" +
                "How to add an element to the collection?\n" +
                "For example, you want to add an element 2 on the 3rd position, then write:\n" +
                "2 3\n");
        Thread.sleep(1500);
        System.out.println("Finally, let's start:");
        System.out.println("If you want to finish adding elements to the collection, simply write END");
        System.out.print("Enter position of the element and the element (e.g: 2 3):");
        // Block of code for filling our collection
        {
            String positionAndElement = scanner.nextLine();
            while (!positionAndElement.equalsIgnoreCase("END")) {
                String[] positionAndElementStringArr = positionAndElement.split(" ");
                int positionAsInteger = Integer.parseInt(positionAndElementStringArr[0]);
                int elementAsInteger = Integer.parseInt(positionAndElementStringArr[1]);
                dll.addNode(positionAsInteger, elementAsInteger);
                System.out.print("Enter position of the element and the element (e.g: 2 3):");
                positionAndElement = scanner.nextLine();
            }
        }
        System.out.print("You finished adding elements to the collection!\n" +
                "Elements of your collection are: ");
        dll.display();
        System.out.println("If you need info how you can manage your collection via the console, write in the console HELP,\n" +
                "if not simply click Enter:");
        String help = scanner.nextLine();
        // condition to show rules how user can manage his collection
        if (help.equalsIgnoreCase("HELP")) {
            System.out.println("If you want to delete node at the given position, you should write:" +
                    "del position\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to search node by item, you should write:" +
                    "search item\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to check either your collection is empty or not, you should write:" +
                    "empty\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to display your collection, you should write:" +
                    "display\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to reverse your collection, you should write:" +
                    "reverse\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to clear your collection, you should write:" +
                    "clear\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            Thread.sleep(1500);
            System.out.println("If you want to get size of your collection, you should write:" +
                    "size\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        System.out.println("Let's get down to business!");
        System.out.println("If you want to finish your work with the collection, just write END");
        // Block of code to manage our collection
        {
            String action = scanner.nextLine();
            while (!action.equalsIgnoreCase("END")) {
                String[] arguments = action.split(" ");
                switch (arguments[0]) {
                    case "del" -> dll.deleteNodeAtGivenPosition(Integer.parseInt(arguments[1]));
                    case "search" -> System.out.println(dll.search(Integer.parseInt(arguments[1])));
                    case "empty" -> System.out.println(dll.isEmpty());
                    case "display" -> dll.display();
                    case "reverse" -> dll.reverse();
                    case "clear" -> dll.clear();
                    case "size" -> System.out.println(dll.getSize());
                    default -> System.out.println("You made a mistake! Repeat one more time, please");
                }
                action = scanner.nextLine();
            }
        }
    }
}
