package com.modifier;

public class Accessmodifier {
    
    int num1 = 1;
    private int num2 = 2;
    protected int num3 = 3;
    public int num4 = 4;
    public static void main(String[] args) {
        Accessmodifier myObj5 = new Accessmodifier();
        encap1 myObj = new encap1();
        encap2 myObj2 = new encap2();
        System.out.println(myObj5.num2);
        myObj.name1();
        myObj2.name2();
    } 
}

 class encap1 extends Accessmodifier{
public void name1() {

    System.out.println("number1 "+ num1);
    System.out.println("number3 "+ num3);
    System.out.println("number4 "+ num4);


}
}


class encap2 {
    public void name2() {
        Accessmodifier myObj3 = new Accessmodifier();

        System.out.println("number1 "+myObj3.num1 );
        System.out.println("number3 "+myObj3.num3 );
        System.out.println("number3 "+myObj3.num4 );


        
    }
}
