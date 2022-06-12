package com.modern.process.generics.method;

public class GenericMethod {
    public  static void main(String[] args){

        // Calling Generic method with Integer argument
        genericDisplay(11);

        // Calling Generic method with String argument
        genericDisplay("Caribou-Academy");

        // Calling Generic method with Double argument
        genericDisplay(1.0);

    }
    // A Generic method example
    private static <T> void genericDisplay(T element) {
        System.out.println(element);
    }

    /* private static void genericDisplay(double element){
        System.out.println(element);
    }
    private static void genericDisplay(String element){
        System.out.println(element);
    }

    private static void genericDisplay(int element) {
        System.out.println(element);
    }*/
}
