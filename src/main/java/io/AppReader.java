package io;

import java.util.Scanner;

public class AppReader {
    private static final Scanner scanner = new Scanner(System.in);


    public static String getString(){
        return scanner.nextLine();
    }

    public static String getStringAndLowerCase(){
        return scanner.nextLine().toLowerCase();
    }

    public static String getStringAndUpperCase(){
        return scanner.nextLine().toUpperCase();
    }

    public static void closeScanner(){
        scanner.close();
    }

}
