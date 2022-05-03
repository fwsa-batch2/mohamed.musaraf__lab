package com.modifier;

public class encap {

    int num1 = 1;
    private int num2 = 2;
    protected int num3 = 3;
    public int num4 = 4;
    public static void main(String[] args) {
        encap1 myObj = new encap1();
        encap2 myObj2 = new encap2();
       int val1 =  myObj.num1;
        System.out.println(val1);
        myObj.name1();
        myObj2.name2();
    } 
}

 class encap1 extends encap{
public int name1() {
    System.out.println("name1 "+ num1);
    return num1;
}
}


class encap2 {
    public int name2() {
        encap myObj3 = new encap();
        System.out.println("name2 "+myObj3.num1);
        return myObj3.num1;
        
    }
}
