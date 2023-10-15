package org.example;

import java.util.Scanner;

public class Input {
    public static String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите заметку: ");
        return in.nextLine();
    }
}
