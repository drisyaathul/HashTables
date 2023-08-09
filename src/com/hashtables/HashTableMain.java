package com.hashtables;

public class HashTableMain {
    public static void main(String[] args) {
//UC1: to find frequency of words in a Sentence.
        String sentence = "To be or not to be";
        String[] arrayWords = sentence.split(" ");

        HashTable <String,Integer> hashTable = new HashTable<>(6);
        for (String words : arrayWords) {
            //System.out.println(words.hashCode());     //to find hashCode of each word
            int index = hashTable.getIndex(words);      //to find index of each word
            System.out.println(words + " => " +words.hashCode()+ " => " +index);
        }
        System.out.println("**************************************************");
//UC2: to find frequency of words in a paragraph.
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves\n" +
                "deliberately into paranoid avoidable situations";
        String[] wordsPara = paragraph.split(" ");

       // HashTable <String,Integer> hashTable = new HashTable<>(6);
        for (String word : wordsPara) {
//            int index = hashTable1.getIndex(word);
//            System.out.println(word+ " => " +wordsPara.hashCode()+ " => " +index);
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null)
                currentFrequency = 1;
            else
                currentFrequency++;

            hashTable.addOrUpdate(word,currentFrequency);
        }
        System.out.println(hashTable);
        System.out.println("**************************************************");
//UC3: to remove a word "Avoidable".
        if (hashTable.remove("avoidable")) {
            System.out.println("Word is Removed.");
        } else
            System.out.println("Word is Not Removed.");
        System.out.println(hashTable);

    }
}
