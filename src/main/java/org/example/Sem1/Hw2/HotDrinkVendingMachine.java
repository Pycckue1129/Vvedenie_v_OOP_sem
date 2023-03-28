package org.example.Sem1.Hw2;

import java.util.List;

public class HotDrinkVendingMachine implements Machine {
    private final List<HotDrink> products;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int temp){
        for(Product product: products){
            if(product instanceof HotDrink){
                if(product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getTemp() == temp){
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}
