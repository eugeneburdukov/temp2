package com.company;

import java.util.Scanner;

public class Main {

    /*
    Палиндром
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;

        do {
            System.out.print("Введите слово из пяти букв: ");
            word = scanner.nextLine();
        } while (word.length() != 5);

        System.out.println(word);

        boolean flag = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i)) {
                System.out.println("не палиндром");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("палиндром");
        }
    }
}
