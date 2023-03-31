package org.example.Sem2.Cw2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptIdMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrder();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}
