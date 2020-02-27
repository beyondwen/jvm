package com.wenhao.jvm.classloader;

public class MyTest6 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(Singleton.count1);
        System.out.println(Singleton.count2);
    }
}

class Singleton {
    //    public static int count1;
    public static int count1 = 1;

    private static Singleton singleton = new Singleton();

    //public static int count2 = 0;
    private Singleton() {
        count1++;
        count2++;
    }

    public static int count2 = 0;

    public static Singleton getInstance() {
        return singleton;
    }
}
