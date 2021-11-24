package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        byte number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (byte i = 10; i > 0; i = (byte) (i - 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        int firstFriday = 3;
        int n = 0;
        for (int day = 0; day < 32; day = day + 1) {
            if (day == firstFriday + 7 * n) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                n = n + 1;
            }
        }
    }

    public static void task3() {
        int year = 2021;
        int last = year - 200;
        int future = year + 100;
        for (int a = last; a < future; a = a + 1) {
            if (a == 1896 || a == 1975 || a == 2054) {
                System.out.println(a);
            }
        }
    }

}
