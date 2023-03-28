package org.HomeWork1;

import static org.HomeWork1.VendingMachine.hotdrinks;

public class Coffee extends  HotDrink {
    private int temperature;

    @Override
    public void getDrink(String name, int volume, int cost, int temperature)
    {
        Coffee hotdrink = new HotDrink(name, volume, cost, temperature);
        hotdrinks.add(hotdrink);
    }
}


