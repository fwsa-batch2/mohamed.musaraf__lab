package com.hackerrank;
import java.util.*;

public class reverse2 {
  public static void main(String[] args) {
      String name = "hasan";
      char ch;
      String reverse="";
      int i=0;
      do{
          ch=name.charAt(i);
          reverse=ch+reverse;
          i++;
      }while(i<name.length());
      System.out.println(reverse);
  }  
}   
