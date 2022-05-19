package com.iopack;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) throws IOException{
       FileWriter fileWriter = new FileWriter("//home//mohamedhasanmusaraf//tqq.txt");
fileWriter.write("hello team ");
fileWriter.append("Good morning");
fileWriter.close();
System.out.println("text written successfully");
    }
}
