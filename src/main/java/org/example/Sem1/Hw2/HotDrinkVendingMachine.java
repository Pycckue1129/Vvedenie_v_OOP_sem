package org.example.Sem1.Hw2;

import java.util.ArrayList;

public class HotDrinkVendingMachine implements VendingMachine {
    private final ArrayList<HotDrinkTemperature> products;

    public HotDrinkVendingMachine(ArrayList<HotDrinkTemperature> products) {
        this.products = products;
    }

    public HotDrinkTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkTemperature product : products) {
            if (product.getName().equals(name) && product.getVolume() == volume && product.getTemperature() == temperature) {
                System.out.println("Возьмите " + name);
                return product;
            }
        }
        return null;
    }
}