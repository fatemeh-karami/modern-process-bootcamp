package com.modern.process.accessmodifiers;

public class SuperPublic {
   // available within the same package
    static void defaultMethod(){
        System.out.println("defaultMethod()");
    }
    // always available from anywhere
    static public void publicMethod(){
        System.out.println("publicMethod()");
    }
    //available within the same class only
    static private void privateMethod(){
        System.out.println("privateMethod()");
    }
    //available within the same package and subclasses
    static protected void protectedMethod(){
        System.out.println("protectedMethod()");
    }
    private void anotherMethod(){
        privateMethod();
        publicMethod();
        defaultMethod();
        protectedMethod();
    }
}
class SuperDefault{

}
