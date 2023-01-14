package org.faithabiola.linkedList;

public class LinkedListDemo {
    public class Node {
        int element;
        Node next;

        Node(int element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }

    private Node head;
    private Node tail;
    //Add last
    public void addLast(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    //Add first
    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    @Override
    public String toString() {
        return "LinkedListDemo{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
