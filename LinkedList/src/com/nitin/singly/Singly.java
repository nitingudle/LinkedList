package com.nitin.singly;

public class Singly<T>
{
    class Node
    {
        Node next;
        T    data;
        Node(T data)
        {
            this.data = data;
        }
    }
    private Node head;
    public void add(T data)
    {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else
        {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public static void main(String arg[])
    {
        Singly<Integer> list = new Singly<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
}
