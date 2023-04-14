package org.example.Sem6.Cw2;

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(1.0, 1.0);
        Calculator calc = new Calculator();
        calc.calculateSwitch(add);
        System.out.println(add.getResult());
    }
}
