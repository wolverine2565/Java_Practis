package org.HomeWork1;

// Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
// и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
// выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
// воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package org.HomeWork1;


public class Main
{
    public static void main(String[] args)
    VendingMachine m = new VendingMachine();

    {
        m.addDrink("Tea", 200, 50);
        m.addDrink("Coffee", 200, 100,);
        System.out.println(m.getDrinkByPrice(50).toString());
        System.out.println(m.getDrinkByname("Coca-cola").toString());
    }
}
