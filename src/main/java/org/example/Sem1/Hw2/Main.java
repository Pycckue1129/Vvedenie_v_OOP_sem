package org.example.Sem1.Hw2;

import java.util.ArrayList;

//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//      перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//      соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//      воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {
        ArrayList<HotDrinkTemperature> products = new ArrayList<>();
        ArrayList<HotDrink> products2 = new ArrayList<>();
        products.add(new HotDrinkTemperature("Tea", 150, 80));
        products.add(new HotDrinkTemperature("Latte", 220, 85));
        products.add(new HotDrinkTemperature("Cacao", 220, 75));
        products.add(new HotDrinkTemperature("Chocolate", 200, 65));
        products2.add(new HotDrink("Sprite", 330));
        products2.add(new HotDrink("CocaCola", 500));

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(products);

        HotDrinkTemperature hotDrink = machine.getProduct("Cacao", 200, 90);
        if(hotDrink == null){
            System.out.println("Ваш выбор отсутствует");
        }
        hotDrink = machine.getProduct("Tea", 150, 80);
        if(hotDrink == null){
            System.out.println("Ваш выбор отсутствует");
        }

    }
}
