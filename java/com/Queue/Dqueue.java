package com.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dqueue {
    public static void main(String[] args) {
        Deque<Integer> deque =  new ArrayDeque<>();
        deque.offer(4);
        deque.offer(1);
        deque.offer(3);
        deque.offer(4);


     System.out.println(deque);
     System.out.println(deque.getFirst());
     System.out.println(deque.getLast());
     System.out.println(deque.getClass());


    }
}
