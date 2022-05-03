package com.encaps;

public class poly {
  public static void main(String[] args) {
      eCommerce onlineShop = new eCommerce();
        flipKart myKart = new flipKart();
        amazon myAmazon = new amazon();
        onlineShop.mobile();
        myKart.mobile();
        myAmazon.mobile();

  }  
}

class eCommerce{
    public void mobile() {
        System.out.println("eCommerce : poco");
    }
}

class flipKart extends eCommerce{
    public void mobile() {
        System.out.println("flipKart : nokia");
    }
}

class amazon extends eCommerce {
    public void mobile() {
        System.out.println("amazon : lava");
    }
}