package HomeWorkJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task06 {
    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        String text = sc.nextLine();
        sc.close();
        // String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";

        long start = System.currentTimeMillis();
        collectStats(text);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        long start2 = System.currentTimeMillis();
        collectStats(text);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);

    }

    static void collectStats(String text) {
        List<String> listStr = Arrays.asList(text.split(" "));
        Map<Integer, List<String>> stats = new HashMap<>();
        listStr.forEach(str -> {
            stats.merge(str.length(), Arrays.asList(str),
                    (oldList, newList) -> Stream.concat(oldList.stream(), newList.stream()) // <--*
                            .collect(Collectors.toList()));
        });
        System.out.println(stats);
    }
}