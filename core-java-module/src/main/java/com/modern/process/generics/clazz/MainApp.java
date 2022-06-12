package com.modern.process.generics.clazz;

public class MainApp {
    public static void main(String[] args){
       /* ClassA classA = new ClassA(15);
        System.out.println(classA.getObj());

        ClassB classB = new ClassB("caribou-Academy");
        System.out.println(classB.getObj());*/

        ClassT<Integer> IntegerClassT = new ClassT<>(15);
        System.out.println(IntegerClassT.getObj());

        ClassT<String> StringClassT = new ClassT<>("caribou-academy");
        System.out.println(StringClassT.getObj());

    }


}
