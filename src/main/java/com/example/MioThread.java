package com.example;

public class MioThread extends Thread {
    private int n;

    public MioThread(int contatore) {
        n = contatore;
    }

    public void run() {

        for (int i = 0; i < n; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);

        }
    }
}
