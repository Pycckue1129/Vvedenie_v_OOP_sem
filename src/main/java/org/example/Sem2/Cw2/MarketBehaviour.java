package org.example.Sem2.Cw2;

import java.util.List;

public interface MarketBehaviour {
    public void acceptIdMarket(Human human);
    public void releaseFromMarket(Human human);
    public void update();
}
