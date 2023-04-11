package org.HomeWork1;

public abstract class HotDrink
{
    protected String name;
    protected int volume;
    protected double cost;
    private int temperature;

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
    @Override
    HotDrink(String name, int volume, int cost, int temperature)
    {
        this.name = name;
        this.volume = volume;
        this.cost = cost;
        this.temperature = temperature;
    }

        public void getDrink(String name, int volume, int cost)
    {
        HotDrink hotdrink = new HotDrink(name, volume, cost)
        {

        };
        hotdrinks.add(hotdrink);
    }


}

