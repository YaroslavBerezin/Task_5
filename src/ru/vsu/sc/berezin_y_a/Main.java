package ru.vsu.sc.berezin_y_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int h = readNumber("Enter height: ");
        int w = readNumber("Enter width: ");

        printAllLines(h, w);

    }

    private static void printAllLines(int h, int w) {
        for (int i = 0; i < h; i++) {
            for (int y = i; y > 0; y--) {
                System.out.print(" ");
            }
            printLine(w, i);
            System.out.println(" ");
        }
    }

    private static void printLine(int w, int i) {
        for (int y = 0; y < (w - i); y++) {
            if (y < 10) {
                System.out.print(y);
            } else {
                System.out.print(y - 10);
            }
        }
    }

    private static int readNumber(String text) {
        System.out.print(text);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Error");
            System.exit(1);
        }
        return number;
    }

}
