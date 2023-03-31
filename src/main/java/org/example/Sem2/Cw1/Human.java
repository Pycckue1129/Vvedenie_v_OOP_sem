package org.example.Sem2.Cw1;

//1. Интерфейс ActorBehavoir, который будет содержать описание
//        возможных действий актора в очереди/магазине
//        2. Абстрактный класс Actor, который хранит в себе параметры
//        актора, включая состояние готовности сделать заказ и факт
//        получения заказа. Дополнение: для большего понимания у студентов,
//        можно сделать методы-геттеры для имени и прочих “персональных данных” abstract
//3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir
public class Human extends Actor {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
}
