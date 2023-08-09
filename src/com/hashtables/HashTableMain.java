package com.hashtables;

public class HashTableMain {
    public static void main(String[] args) {

        String sentence = "To be or not to be";
        String[] arrayWords = sentence.split(" ");

        HashTable <String,Integer> hashTable = new HashTable<>(3);
        for (String words : arrayWords) {
            //System.out.println(words.hashCode());     //to find hashCode of each word
            int index = hashTable.getIndex(words);      //to find index of each word
            System.out.println(words + " => " +words.hashCode()+ " => " +index);
        }



    }
}
