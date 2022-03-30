package com.bridgelabz.StacksAndQueues;

public class DequeueFromBeginning
{
    public Node head;
    public Node tail;
    static class Node  {
        int data;
        Node next;

        Node(int data)  {
            this.data = data;
            next = null;
        }
    }
    //Append datas One By One
    public void append(int datas)  {
        Node newNode = new Node(datas);
        if(head == null)  {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    //Display all the Node with value
    public void display()  {
        Node current = head;
        if(head == null)  {
            System.out.println("List is Empty");
        }
        while (current != null)  {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    //Dequeue all the elements
    public void dequeue()  {
        Node current = head;
        while (current != head)  {
            if(current == head)  {
                head = head.next;
                current = head;
            }
        }

    }
    public static void main(String[] args) {
        DequeueFromBeginning operationQueue = new DequeueFromBeginning();
        operationQueue.append(70);
        operationQueue.append(30);
        operationQueue.append(56);

        operationQueue.display();
    }
}
