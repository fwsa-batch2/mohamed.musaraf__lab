package com.iopack;
import java.io.*;


public class Create {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//mohamedhasanmusaraf//tqq.txt");

        if (file.createNewFile()) {
            System.out.println("file created");
        } else {
            System.out.println("file not created");
        }
    }
}
