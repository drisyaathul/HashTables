package com.hashtables;

public class MyMapNode <K,V>{
    //Initialising Data and Node using Generics.
    K key;
    V value;
    MyMapNode<K,V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
