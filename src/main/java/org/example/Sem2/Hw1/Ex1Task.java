package org.example.Sem2.Hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex1Task extends Ex1{

    @Override
    public List<Integer> getSomeList() {
        return someList;
    }

    @Override
    public List<Integer> setSomeList() {
        return someList = new LinkedList<>(Arrays.asList(1, -2, -3, 4, -5, 6, 7, -8, -9));
    }

    @Override
    public void List() {
        for (int i = 0; i < someList.size(); i++) {
            if (someList.get(i) < 0) {
                someList.remove(i);
                i--;
            }
        }
    }

    @Override
    public List<Integer> someList() {
        return null;
    }
}
