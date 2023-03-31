package org.example.Sem2.Cw2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//1. Интерфейс QueueBehaviour, который описывает логику очереди –
//      помещение в/освобождение из очереди, принятие/отдача заказа
//2. Интерфейс MarketBehaviour, который описывает логику магазина –
//      приход/уход покупателей, обновление состояния магазина
//3. Класс Market, который реализовывает два вышеуказанных интерфейса
//      и хранит в списке список людей в очереди в различных статусах
public class Market implements QueueBehaviour, MarketBehaviour{
        List<Human> myList = new ArrayList<>();
        Queue<Human> myList2 = new LinkedList<>();

        @Override
        public void acceptIdMarket(Human human) {
                myList.add(human);
        }

        @Override
        public void releaseFromMarket(Human human) {
                myList.remove(human);
        }

        @Override
        public void update() {

        }

        @Override
        public void takeInQueue(Human human) {
                myList2.add(human);
        }

        @Override
        public void takeOrders() {
                myList2.peek().setTakeOrder();
        }

        @Override
        public void giveOrder() {
                myList2.peek().setMakeOrder();
        }

        @Override
        public void releaseFromQueue() {
                myList2.poll();
        }
}
