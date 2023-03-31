package org.example.Sem2.Cw2;

public interface QueueBehaviour {
    public void takeInQueue(Human human);
    public void takeOrders();
    public void giveOrder();
    public void releaseFromQueue();
}
