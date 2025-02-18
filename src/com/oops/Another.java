package com.oops;

public class Another {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();
// all 3 reference variables are pointing towards single object
    }
}
