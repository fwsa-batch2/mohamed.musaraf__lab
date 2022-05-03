package com.encaps;

public class inheritFile {
    public static void main(String[] args) {
        animal2 behaveAnimal = new animal2();
        behaveAnimal.cat();
        behaveAnimal.dog();
    }
}


class animal {
    public void dog() {
        System.out.println("eat");
    }
}

class animal2 extends animal{
public void cat() {
    System.out.println("fight");
}
}