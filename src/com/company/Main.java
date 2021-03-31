package com.company;

import java.util.Scanner;

public class Main {

    public static String binaryToDecimal(int decimalNumber) {
        String binaryNumber = "";

        while (decimalNumber > 0) {
            binaryNumber = (decimalNumber % 2) + binaryNumber;
            decimalNumber = (decimalNumber / 2);
        }
        return binaryNumber;
    }

    public static int decimalToBinary(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;

        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimalNumber += temp * Math.pow(2, power);
                binaryNumber = binaryNumber / 10;
                power++;
            }
        }
        return decimalNumber;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz co chcesz zrobic");
            System.out.println("1. Konwersja dziesietne - binarne");
            System.out.println("2. Konwersja binarne - dziesietne");
            System.out.println("3. Koniec");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Konwersja dziesietne - binarne.");
                    System.out.println("Podaj liczbe jaka chcesz poddac konwersji");
                    int decimalNumber = scanner.nextInt();
                    String result = binaryToDecimal(decimalNumber);
                    System.out.print(result);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Konwersja binarne - dziesietne");
                    System.out.println("Podaj liczbe jaka chcesz poddac konwersji");
                    int binaryNumber = scanner.nextInt();
                    int result2 = decimalToBinary(binaryNumber);
                    System.out.println(result2);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Niepoprawny wybor");
            }
        }
    }
}
