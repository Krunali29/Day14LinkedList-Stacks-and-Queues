package com.bridgelabz.LinkedList;

public class SortedLinkedList
{
    Node head, tail;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            Node temp = head;
            Node prevNode = head;
            if (head.key > data){
                newNode.next = head;
                head = newNode;
            }
            else {
                while (temp.key < data && temp.next != null){
                    prevNode = temp;
                    temp = temp.next;
                }
                if (temp == tail){
                    if (temp.key < data){
                        temp.next = newNode;
                        tail = newNode;
                    }
                    else {
                        newNode.next = temp;
                        prevNode.next = newNode;
                    }
                }
                else {
                    newNode.next = temp;
                    prevNode.next = newNode;
                }
            }
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
