package org.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine
{
    List<HotDrink> hotdrinks = new ArrayList<HotDrink>();
    public HotDrink getDrinkByname(String name)
    {
        for (HotDrink hotdrink : hotdrinks)
        {
            if (hotdrink.getName()==name)
            {
                return hotdrink;
            }
        }
        return null;
    }

    public HotDrink getDrinkByPrice(int cost)
    {
        for (HotDrink hotdrink : hotdrinks)
        {
            if (hotdrink.getCost()==cost)
            {
                return hotdrink;
            }
        }
        return null;
    }

    public void addDrink(String name, int volume, int cost)
    {
        HotDrink hotdrink = new HotDrink(name, volume, cost)
        {
        };
        hotdrinks.add(hotdrink);
    }
}

