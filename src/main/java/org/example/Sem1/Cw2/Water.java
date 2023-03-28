package org.example.Sem1.Cw2;

public class Water extends Product{
    private Integer volume;

    public Water(String name, Double price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Water(String name, Double price) {
        super(name, price);
    }
}

