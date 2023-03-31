package org.example.Sem2.Hw1;

import java.util.List;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */
public class Main {
    public static void main(String[] args) {
        Ex1Task ex1 = new Ex1Task();
        ex1.setSomeList();
        System.out.println(ex1.getSomeList());
        ex1.List();
        System.out.println(ex1.getSomeList());
    }
}
