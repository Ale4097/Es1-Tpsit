package com.example;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        System.out.println(Thread.currentThread().getName());
        
        MioThread pippo = new MioThread(198);
        pippo.start();
        MioThread pluto = new MioThread(195);
        pluto.start();
        pippo.join();
        pluto.join();
        System.out.println("finito");
    }
}