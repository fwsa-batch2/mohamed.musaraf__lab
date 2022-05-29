package com.hackerrank;
import java.io.*;
import java.util.*;

public class string {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String C=A.substring(0,1).toUpperCase();
        String D=B.substring(0,1).toUpperCase();
        String E=A.substring(1, 5);
        String F=A.substring(1, 4);
        System.out.println((A+B).length());
        int i = A.compareTo(B);
        if(i>0){
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }        System.out.print((C+E)+" "+(D+F));
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



