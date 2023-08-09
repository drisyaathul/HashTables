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
    }

    public int getIndex(K key) {
        //h(k)= hashcode of k % m;
        int index = Math.abs(key.hashCode()) % bucketSize;
        return index;
    }
}
