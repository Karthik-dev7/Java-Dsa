package com.oops;

public class BoxWeight extends Box{
     double Weight;

   BoxWeight(){
        this.Weight = -1;
    }

    BoxWeight(double side, double Weight){
       super(side);
       this.Weight = Weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //super class calls above parameters, as it mentions the above objects
        super(l, h, w); // call(initialise the value present in)the parent-class constructor
        Weight = weight;
        //even-though we change the class(eg: double l)as private,
        // we can still access here as those are initialised in the parent class(eg: Box)
    }
}
// child class can access parent objects and the above consist in the parent class unless it's private