package HomeWorkJava;

import java.util.ArrayList;

public class Task07 {
    public static void main(String[] args) {

        // ArrayList<String[]> workers = new ArrayList<>();
        ArrayList<Person> workers = new ArrayList<>();


        Person work1 = new Person("Сидоров", "Иван", "19", "м", "программист", "Санкт-Петербург");
        Person work2 = new Person("Васильев", "Евгений", "21", "м", "бухгалтер", "Москва");
        Person work3 = new Person("Петров", "Василий", "18", "м", "дизайнер", "Сочи");
        Person work4 = new Person("Иванов", "Иван", "22", "м", "руководитель", "Мурманск");

        workers.add(work1);
        workers.add(work2);
        workers.add(work3);
        workers.add(work4);



        for (Person work : workers) {
            if (Integer.parseInt(work.age) > 20) {
                System.out.println(work);
            }

        }

        System.out.println(work1.name.equals(work3.name));
        System.out.println(work1.surname.hashCode());
        System.out.println(work4.surname.hashCode());

    }

}