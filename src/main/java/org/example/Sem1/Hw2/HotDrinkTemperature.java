package org.example.Sem1.Hw2;

public class HotDrinkTemperature extends HotDrink {
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinkTemperature(String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

}
