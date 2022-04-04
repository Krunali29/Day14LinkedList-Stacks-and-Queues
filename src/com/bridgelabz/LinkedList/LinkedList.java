package com.bridgelabz.LinkedList;

public class LinkedList {
    Node head, tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.key + "->");
            temp = temp.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAfter(int prevData,int data){
        Node newNode = new Node(data);
        Node searchedNode = this.search(prevData);
        if( searchedNode != null){
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            //newNode.next = tempNode;
        }
    }
    public Node search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.key == data)
                return temp;
            temp = temp.next;
        }
        return null;
    }
}