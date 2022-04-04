package com.bridgelabz.LinkedList;


public class MainClass
{
    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);
        list.insertAfter(30,40);
        list.display();
        Node searchedNode = list.search(30);
        if (searchedNode == null)
            System.out.println("\nData Not Found");
        else
            System.out.println("\nData Found");
    }
}
