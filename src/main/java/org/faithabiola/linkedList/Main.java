package org.faithabiola.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        System.out.println(linkedList);
        linkedList.addFirst(5);
        System.out.println(linkedList);
    }
}
