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
    public void pop(){
        head = head.next;
    }
    public void popLast(){
        Node temp = head;
        Node prevNode = null;
        while (temp.next != null)
        {
            prevNode = temp;
            temp = temp.next;
        }
        assert prevNode != null;
        prevNode.next = null;
    }
    public void delete(int data){
        Node temp = head;
        Node prevNode = head;
        while(temp.key != data) {
            prevNode = temp;
            temp = temp.next;
        }
        if (temp == head)
            head = head.next;
        else
            prevNode.next = temp.next;
    }
    public void size(){
        Node temp = head;
        int size = 1;
        while (temp.next != null){
            size++;
            temp = temp.next;
        }
        System.out.println("Size : "+size);
    }
}