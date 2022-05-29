package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class list {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(scan.nextLine());
            list.add(b);
        }
        int addint = Integer.parseInt(scan.nextLine());
        list.add(a, addint);
        int removeint = Integer.parseInt(scan.nextLine());
        list.remove(removeint);
        System.out.println(list);
        scan.close();
    }
}
