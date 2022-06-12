package com.modern.process.interfaces.multiInheritance;

public class Car implements Fly , Transform{
    @Override
    public void fly() {
        System.out.println("fly");

    }

    @Override
    public void transform() {
        System.out.println("transform");

    }
}
