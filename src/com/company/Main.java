package com.company;


import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Random r = new Random();


    public static void main(String[] args) {
//        Ex_1();
//        Ex_2();
        // Ex_3();
//        Ex_4();
        // Ex_5();
        Ex_6();
//        Ex_7();
//        Ex_8();
    }

    private static void Ex_1() {
        System.out.println("\nTask 1: В массиве хранится информация о численности книг в каждом из 35\n" +
                "разделов библиотеки. Выяснить, верно ли, что общее число книг в\n" + "библиотеке есть шестизначное число." + System.lineSeparator());
        int[] book = new int[35];
        int sum = 0;
        Random r = new Random();
        for (int i = 0; i < book.length; i++) {
            book[i] = r.nextInt(50) * 100;
            sum += book[i];
        }
        System.out.println(Arrays.toString(book));
        System.out.println("Введите количесво книг  " + sum);
        System.out.println((sum > 99999 && sum < 1000000) ? "Число шестизначное" : "Число не шестизначное");
    }

    private static void Ex_2() {
        System.out.println("\nTask2: В массиве хранится информация о баллах, полученных спортсменом десятиборцем в каждом из десяти видов спорта\n" +
                "Для выхода в следующий  этап соревнований общая сумма баллов должна превысить некоторое  известное значение.\n" +
                "Определить, вышел ли данный спортсмен в  следующий этап соревнований. \n" + System.lineSeparator());
        int[] sportsmen = new int[10];
        int points = 0;
        Random random = new Random();
        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i] = random.nextInt(100);
            points += sportsmen[i];
        }
        System.out.println(Arrays.toString(sportsmen));
        System.out.println("сумма баллов " + points);
        System.out.println((points > 600) ? "спортсмен вышел в следующий этап соревнований" : "спортсмен покинул соревнования");
    }

    private static void Ex_3() {
        System.out.println("\n Task3:Оценки, полученные спортсменом в соревнованиях по фигурному катанию  (в баллах), хранятся в массиве из 18 элементов\n " +
                "В первых шести элементах  записаны оценки по обязательной программе, с седьмого по  двенадцатый — по короткой программе, в остальных — по произвольной  программе.\n" +
                "Выяснить, по какому виду программы спортсмен показал  лучший результат.\n" + System.lineSeparator());
        int[] points = new int[18];
        int best_res = 0;
        int sum1 = 0, sum2 = 0, sum3 = 0;
        Random random = new Random();

        for (int i = 0; i < 18; i++) {
            points[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(points));
        for (int i = 0; i < 6; i++) {
            sum1 += points[i];
        }
        for (int i = 6; i < 12; i++) {
            sum2 += points[i];
        }
        for (int i = 12; i < 18; i++) {
            sum3 += points[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        if (sum1 > sum2 && sum1 > sum3) {
            System.out.println("First programm");
        } else if (sum2 > sum1 && sum2 > sum3) {
            System.out.println("second programm");
        } else if (sum3 > sum2 && sum3 > sum1) {
            System.out.println("third programm");
        } else System.out.println("Sportsmen has no best result ");
    }

    private static void Ex_4() {
        System.out.println("Написать программу определения в одномерном массиве вещественных\n" + "чисел наибольшего количества последовательно расположенных\n" +
                "положительных чисел.\n" + System.lineSeparator());
        int[] mas = {-1, -6, 4, 2, -4, -4, 3, -4, 6, -8};
        long max = 0, current = 0;
        for (int i = 0; i < mas.length; i++) {
            System.out.println(" " + mas[i]);
            if (mas[i] > 0)
                current++;
            else {
                if (current > max)
                    max = current;
                current = 0;
            }
        }
        System.out.println("количествo последовательно расположенных положительных чисел: " + max);
    }

    private static void Ex_5() {
        System.out.println("Задан целочисленный массив размерности N. Есть ли среди элементов\n" +
                "массива простые числа? Если да, то вывести номера этих элементов.\n" + System.lineSeparator());
        Random random = new Random();
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
//            System.out.println(" " + array[i]);
            for (int j = 3; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    System.out.println(array[i] + " " + j);
                    array[i] = 0;
                }
            }
            if (array[i] != 0) System.out.println("простые числа, номера этих элементов " + i);
        }
    }

    private static void Ex_6() {
        System.out.println("Дан массив, в котором все элементы различны. Заменить в нём нулём :\n" +
                "а) максимальный элемент;\n" +
                "б) минимальный элемент.\n" + System.lineSeparator());
        int[] values = new int[10];
        Random rnd = new Random();
        System.out.print("Исходный массив : ");

        for (int i = 0; i < values.length; i++) {
            values[i] = rnd.nextInt(5);
        }
        System.out.println(Arrays.toString(values));
        int indexMax = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] > indexMax) {
                indexMax = values[i];
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == indexMax) {
                values[i] = 0;
            }
        }
        System.out.println("\nМаксимальный элемент " + indexMax);
        System.out.println(Arrays.toString(values));


        System.out.print("Исходный массив : ");

        for (int i = 0; i < values.length; i++) {
            values[i] = rnd.nextInt(5);
        }
        System.out.println(Arrays.toString(values));
        int indexMin = 1;
        for (int i = 1; i < values.length; i++) {
            if (values[i]< values[indexMin]) {
                indexMin = i;
            }
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == indexMin) {
                values[i] = 0;
            }
        }
        System.out.println("\nминимальный элемент " + indexMin);
        System.out.println(Arrays.toString(values));
    }
}











