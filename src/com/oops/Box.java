package com.oops;

public class Box {
    double l;
    double h;
    double w;

    Box(double l, double h, double w) {
        System.out.println("parent-class constructor");// it is referred in child-class
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(double side){
        super();
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(Box old){
        this.l = old.h;
        this.h = old.h;
        this.w = old.w;

    }

    public void information(){
        System.out.println("this is running");
    }

    public static void main(String[] args) {
        Box list = new Box(12.3, 23.5, 23.8);
        BoxWeight and = new BoxWeight();
        System.out.println(list.l+" "+list.h+" "+list.w);
    }
}
