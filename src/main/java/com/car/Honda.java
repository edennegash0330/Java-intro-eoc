package com.car;


public class Honda extends Car {
   
    private boolean isTurboCharged;


    public  Honda(String color, Double year, String maxSpeed, boolean isTurboCharged){
       
        super(color, year, maxSpeed); 
        this.isTurboCharged=isTurboCharged;

    }
    public boolean isTurboCharged(){
        return isTurboCharged;
    }
   
    
}