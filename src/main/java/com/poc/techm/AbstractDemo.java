package com.poc.techm;

public abstract class AbstractDemo {
    abstract void showMessage();
    abstract int add(int x, int y);

    public int mul(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        AbstractDemo ab=new AbstractDemo() {
            @Override
            void showMessage() {
                System.out.println("Anonymous class implemented by abstract class");
            }

            @Override
            int add(int x, int y) {
                return x+y;
            }
        };
        System.out.println(ab.mul(10,20));
        System.out.println(ab.add(10,20));
        ab.showMessage();
    }
}
