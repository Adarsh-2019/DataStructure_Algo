package com.poc.techm;

public abstract class AbstractClass {
    abstract void method();

    static AbstractClass createInstance() {
        return new ConcreteClass();
    }
}

class ConcreteClass extends AbstractClass {

    @Override
    void method() {
        System.out.println("Implementation of abstract method");
    }

    public static void main(String[] args) {
        ConcreteClass cc = new ConcreteClass();
        cc.method();
    }
}