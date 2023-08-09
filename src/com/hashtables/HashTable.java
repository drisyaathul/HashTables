package com.hashtables;

import java.util.ArrayList;
import java.util.List;

public class HashTable <K,V> {
    //initializing
    int bucketSize;
    List<HashLinkedList<K,V>> bucketArray = new ArrayList<>(bucketSize);
    //Array List size increases at run-time, so it is called dynamic array.

    public HashTable(){
    }

    public HashTable(int bucketSize) {
        this.bucketSize = bucketSize;
        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(i, null);
        }
    }

    public int getIndex(K key) {
        //h(k)= hashcode of k % m;
        int index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }

    public V get(K key) {
        /*
        to know the frequency of the word
         */
        int index = getIndex(key);
        HashLinkedList<K,V> hashLinkedList = bucketArray.get(index);
        if (hashLinkedList == null) {
            return null;
        }
        MyMapNode <K,V> currentNode = hashLinkedList.search(key);
        if (currentNode != null){
            return currentNode.value;
        }else
            return null;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "bucketArray=" + bucketArray +
                '}';
    }

    public void addOrUpdate(K key, V value) {
        /*
        Creating new linkList
         */
        int index = getIndex(key);
        HashLinkedList<K, V> hashLinkedList = bucketArray.get(index);
        if (hashLinkedList == null) {
            hashLinkedList = new HashLinkedList<>();
            bucketArray.add(index, hashLinkedList);
            hashLinkedList.append(key, value);
        } else {
            /*
            When linkList already exists and whether the linked list word already present or not
             */
            MyMapNode <K,V> currentNode = hashLinkedList.search(key);
            if (currentNode != null)
                currentNode.value = value; //updating the node when the current node is not null
            else
                hashLinkedList.append(key, value);

        }
    }
    public boolean remove (K key) {
        int index = getIndex(key);
        HashLinkedList<K,V> hashLinkedList = bucketArray.get(index);
        hashLinkedList.delete(key);
        return false;
    }
}
