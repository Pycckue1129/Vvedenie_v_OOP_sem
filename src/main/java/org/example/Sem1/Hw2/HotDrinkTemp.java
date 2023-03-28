package org.example.Sem1.Hw2;

public class HotDrinkTemp extends HotDrink {
    private Integer temp;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public HotDrinkTemp(String name, Double price, Integer temp) {
        super(name, price);
        this.temp = temp;
    }
    public HotDrinkTemp(String name, Double price) {
        super(name, price);
    }

}
