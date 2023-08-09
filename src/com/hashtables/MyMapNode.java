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

    @Override
    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        nodeString.append("Node: " + " K = ").append(key).append(", V = ").append(value).append("\n");
        if (next != null)
            nodeString.append(" , ").append(next);
        return nodeString.toString();
    }
}
