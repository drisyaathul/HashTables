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
    public boolean delete(K key) {
        /*
         * Deleting the node:-
         * creating temp node to search the node for deleting
         */
        MyMapNode<K,V> temp1 = head;
        MyMapNode<K,V> temp2 = head;
        MyMapNode<K,V> temp3 = head;
        int count = 0;
        while (temp1 != null & temp2 != null & temp3 != null) {
            count++;
            if (count > 2) {
                temp3 = temp3.next;
            }
            if (temp1.key == key) {
                temp2 = temp2.next;
                temp3.next = temp2;
                return true;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n{" + head + '}';
    }
}
