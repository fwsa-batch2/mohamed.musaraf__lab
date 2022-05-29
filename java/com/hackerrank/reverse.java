package com.hackerrank;

    import java.io.*;
    import java.util.*;
    import java.lang.*;
    
    public class reverse {
    
        public static void main(String[] args) {
            
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B =A.toLowerCase();
            StringBuffer input1 = new StringBuffer();
            input1.append(A);
              String C = String.valueOf(input1.reverse());
              String D = C.toLowerCase();
             if(B.equals(D)){
                 System.out.println("Yes");
                 
             }else{
                            System.out.println("No");
      
             }
            /* Enter your code here. Print output to STDOUT. */
            
        }
    }
      

