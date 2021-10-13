package com.geekbrains.home_work_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        int a = 42;
        int b = 24;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("\nСумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

}
