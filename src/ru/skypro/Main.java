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
        for (int day = 0; day <= 31; day ++) {
            if (day == firstFriday + 7 * n) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                n++;
            }
        }
    }

    public static void task3() {
        int year = 2021;
        int last = year - 200;
        int future = year + 100;
        int n = 0;
        for (int a = last; a < future; a++) {
            if (a == 1896 + 79 * n) {
                System.out.println(a);
                n++;
            }
        }
    }
}
