package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2016));

        System.out.println(Arrays.toString(createArray(10, 3)));

        replacementArray(args);

        multiplicationArray(args);

        squareArray(args);

        // // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0,
        // 1,x],[0, 0, 0, 1]]

        // int x = array[2][3];

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     * true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            // проверить, что сумма a и b лежит между 10 и 20
            return true;
        return false;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x < 0)
            return false;
        return true;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String n = "";
        for (int i = 1; i <= repeat; i++) {
            n = n + source;
        }
        System.out.println(n);
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        Arrays.fill(array, initalValue);
        return array;
    }

    // * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    // * заменить 0 на 1, 1 на 0;
    private static void replacementArray(String[] args) {
        int[] array = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
    // * циклом, и числа меньшие 6 умножить на 2;
    private static void multiplicationArray(String[] args) {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    // * 3. Создать квадратный двумерный целочисленный массив (количество строк и
    // * столбцов одинаковое),
    // * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно
    // * только одну из диагоналей, если обе сложно).
    // * Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    // * * Также заполнить элементы побочной диагонали

    private static void squareArray(String[] args) {
        int[][] array = new int[4][4];
        {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j])
                        array[i][j] = 1;
                    array[array.length - j - 1][j] = 1;
                }
                System.out.println(Arrays.toString(array[i]));
            }

        }
    }

}