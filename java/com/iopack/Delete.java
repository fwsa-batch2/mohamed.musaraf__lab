package com.iopack;

import java.io.*;

public class Delete {
    public static void main(String[] args) throws IOException {
        File file = new File("//home//mohamedhasanmusaraf//tqq.txt");

        file.delete();
        System.out.println("file successfully deleted");
    }
}
