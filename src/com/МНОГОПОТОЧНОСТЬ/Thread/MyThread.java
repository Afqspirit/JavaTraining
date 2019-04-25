package com.МНОГОПОТОЧНОСТЬ.Thread;

// Create a thread by implementing Runnable.

class MyThread extends Thread {
    //Thread thrd;

    // Construct a new thread.
    MyThread(String name) {
        super(name);
        start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting");
        try {
            for(int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("В " + getName() +
                        ", счетчик:" + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
