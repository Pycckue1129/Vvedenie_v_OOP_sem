package org.example.Sem1.Hw2;

import java.util.ArrayList;
import java.util.List;

//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
//      перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
//      соответствующий имени, объему и температуре
//В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
//      воспроизвести логику заложенную в программе
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {
        List<HotDrinkTemp> list = new ArrayList<>();
        list.add(new HotDrinkTemp("Cappuccino", 200.0, 60));
        list.add(new HotDrinkTemp("Tea", 100.0, 40));
        list.add(new HotDrinkTemp("Latte", 220.0, 65));

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(list);

        HotDrinkTemp hotDrinkTemp = machine.getProduct("Cappuccino", 60);
        System.out.println(hotDrinkTemp);


//        System.out.println(hotDrink);

    }
}
