package org.example.Lsn5.Hw1;

public class Main {
    public static void main(String[] args) {
        Num res = new Num(3, 5, 6);
        res.setNum1(4);
        res.setNum2(3);
        res.setNum3(2);
        System.out.println(res.Sum());
        System.out.println(res.Multiply());
        System.out.println(res.Div());

   }
}

