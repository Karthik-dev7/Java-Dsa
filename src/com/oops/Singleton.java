package com.oops;
//It's nothing but only object can be created in a entire class
public class Singleton {
     private Singleton(){

    }
    private static Singleton instance;

     public static Singleton getInstance(){

         //check only one object created or not
         if(instance == null){
             instance = new Singleton();
         }
         return instance;
     }
}
