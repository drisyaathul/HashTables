package com.hashtables;

public class HashLinkedList <K,V> {

    MyMapNode<K, V> head;
    MyMapNode<K, V> tail;

    public void append(K key, V value) {
        /*
         * New Node is created in the Linked list.so the head and tail is new node.
         * if head is not equal to null, then tail.next will be new node.
         * And tail is New node.
         */
        MyMapNode<K,V> newNode = new MyMapNode<>(key,value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public MyMapNode<K, V> search(K searchData) {
        /*
         when temp node is head,and temp is not equal to null then its data equals to search data
         */
        MyMapNode<K, V> temp = head;
        while (temp != null) {
            if (temp.key.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null; //when temp = null;
    }

    @Override
    public String toString() {
        return "\n{" + head + '}';
    }
}
