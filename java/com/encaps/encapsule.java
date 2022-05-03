package com.encaps;

public class encapsule {
    private int accountNum = 1234;
    private String password = "Hasan123";

    public int getAccountNum() {
        return accountNum;
    }

    public String getPassword(){
        return password;
    }

    public void setAccountNum(int accountNum){
    this.accountNum = accountNum;
    }

    public void setPassword(String password ){
        this.password = password;
    }

    public static void main(String[] args) {
        encapsule myObj = new encapsule();
        myObj.setAccountNum(1234);
        System.out.println(myObj.getAccountNum());
        
    } 

}



