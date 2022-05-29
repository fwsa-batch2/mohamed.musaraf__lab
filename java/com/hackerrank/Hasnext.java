package com.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hasnext {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext()) {
            String b = scan.nextLine();
            System.out.println(i + " " + b);

            i++;
        }
        
    }

}
