package com.listarray;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<String>();
        stacks.push("first");
        stacks.push("second");
        stacks.push("third");
        stacks.push("fourth"); // last in first out
        System.out.println(stacks);

        stacks.pop(); 
        System.out.println(stacks);

    }
}
