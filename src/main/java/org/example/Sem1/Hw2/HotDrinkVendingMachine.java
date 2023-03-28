package org.example.Sem1.Hw2;

import java.util.List;

public class HotDrinkVendingMachine implements Machine {

    private final List<HotDrinkTemp> products;

    public HotDrinkVendingMachine(List<HotDrinkTemp> products) {
        this.products = products;
    }

    public HotDrink getProduct(String name){
        for(HotDrink hotDrink : products){
            if(hotDrink.getName().equalsIgnoreCase(name)){
                return hotDrink;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrinkTemp getProduct(String name, int temp){
        for(HotDrink hotDrink : products){
            if(hotDrink instanceof HotDrinkTemp){
                if(hotDrink.getName().equalsIgnoreCase(name) && ((HotDrinkTemp) hotDrink).getTemp() == temp){
                    return (HotDrinkTemp) hotDrink;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
