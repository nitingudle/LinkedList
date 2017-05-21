package com.nitin.circular;

public class Circular<T>
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
            while (current.next != null && current.next != head)
                current = current.next;
            current.next = newNode;
            newNode.next = head;
        }
    }

    public static void main(String arg[])
    {
        Circular<Integer> list = new Circular<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }
}
