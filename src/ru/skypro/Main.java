package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = (i - 1)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task2() {
        int friday = 3;
        for (; friday < 32; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2021;
        int last = currentYear - 200;
        int future = currentYear + 100;
        for (int comet = 0; comet < future; comet = comet + 79) {
            if (comet > last) {
                System.out.println(comet);
            }
        }
    }
}
