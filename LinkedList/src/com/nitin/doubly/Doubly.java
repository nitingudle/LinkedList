package com.nitin.doubly;

public class Doubly<T>
{
    class Node
    {
        Node next;
        Node prev;
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
            newNode.prev = current;
            head.prev = current.next;
        }
    }

    public static void main(String arg[])
    {
        Doubly<Integer> list = new Doubly<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
}
