package com.modern.process.interfaces;

public interface Electronic {
    //constant variable
    String LED = "LED";

    //abstract method
    int getElectricityUse();

    //static method
    static boolean isEnergyEfficient(String electronicType){
        if (electronicType.equals(LED)){
            return true;
        }
        return false;
    }

    //default method
    default void printDescription(){
        System.out.println("Electronic description");
    }
}
