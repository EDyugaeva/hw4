package ru.skypro;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    public static void task1() {
        int number = 1;
        while (number <= 10) {
            if (number == 10) {
                System.out.println(number);
                break;
            }
            System.out.print(number + " ");
            number++;
        }
        for (; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task2() {
        int friday = 3;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2021;
        int last = currentYear - 200;
        int future = currentYear + 100;
        for (int i = last; i < future; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
