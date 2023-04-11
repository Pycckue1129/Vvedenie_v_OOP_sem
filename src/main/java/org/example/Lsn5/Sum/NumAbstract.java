package org.example.Lsn5.Sum;

public abstract class NumAbstract implements NumInterface {
    private int num;

    protected NumAbstract(int num) {
        this.num = num;
    }

    @Override
    public void Sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
