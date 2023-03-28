package org.HomeWork1;

public abstract class HotDrink
{
    protected String name;
    protected int volume;
    protected double cost;

    public String getName()
    {
        return name;
    }

    public int getVolume()
    {
        return volume;
    }

    public double getCost()
    {
        return cost;
    }



    HotDrink(String name, int volume, int cost)
    {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }

        public void getDrink(String name, int volume, int cost)
    {
        HotDrink hotdrink = new HotDrink(name, volume, cost)
        {

        };
        hotdrinks.add(hotdrink);
    }


}

