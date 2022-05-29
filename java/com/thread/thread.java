package com.thread;


public class thread implements Runnable{

    public void run(){
        System.out.println("FWSA king");
    }

    public static void main(String[] args) {
        thread threadOp = new thread();
        Thread threadName = new Thread(threadOp);
        threadName.start();

        System.out.println("i'm hero");
    }
}

