package org.example.Lsn5;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.setA(5);
        B b = new B();
        b.setB(3);

        int c = a.getA() + b.getB();
        System.out.println(c);
    }
}
