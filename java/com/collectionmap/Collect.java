package com.collectionmap;

import java.util.*;

public class Collect {

    public static void main(String[] args) {
        Collect cl = new Collect();
        hashMap();
        cl.hashtable();
        linkedMap();
        treeMap();
    }

    public static void hashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hasan");
        hashMap.put(3, "mohamed");
        hashMap.put(3, "musaraf");
        hashMap.put(2, "Asha");

        System.out.println("hashmap"+hashMap);
        System.out.println("hashmap"+hashMap.entrySet());
        System.out.println("hashmap"+hashMap.keySet());
        System.out.println("hashmap"+hashMap.values());

    }

    public void hashtable() {
        Hashtable<Integer, String> hashTble = new Hashtable<>();

        hashTble.put(1, "lion");
        hashTble.put(3, "tiger");
        hashTble.put(2, "fox");
        hashTble.put(1, "deer");

        System.out.println("hashTable"+hashTble);

    }

    public static void linkedMap() {
        LinkedHashMap<Integer, String> linked = new LinkedHashMap<>();
        linked.put(2, "mom");
        linked.put(1, "dad");
        linked.put(3, "son");
        System.out.println("linkedListTable"+linked);
    }

    public static void treeMap() {
        TreeMap<Integer,String> tree= new TreeMap<>();
        tree.put(4, "java");
        tree.put(2, "ruby");
        tree.put(1, "js");
        tree.put(2, "html");
        System.out.println(tree);

    }
}
