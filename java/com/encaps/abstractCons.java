package com.encaps;

class oopAbstract {
    public static void main(String[] args) {
        InnerabstractCons myObj = new InnerabstractCons();
        myObj.human();
        myObj.name();
    }

}

abstract class abstractCons {

    public abstract void human();

    public void name() {
        System.out.println("musaraf");
    }
    
}

 class InnerabstractCons extends abstractCons{

    public void human() {
        System.out.println("ajith");
    }

}

