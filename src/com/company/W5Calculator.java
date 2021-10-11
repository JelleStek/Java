package com.company;

import java.util.Scanner;

public class W5Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char karakter = '+';

        while (karakter != 'S') {
            System.out.print("Operator (S = stoppen): ");
            String karakterString = input.next();
            karakter = karakterString.charAt(0);

            //while loop die kijkt of karakter geldig is via method.
            while(isGeldigeOperator(karakter) != true) {
                //exit code indien iemand 'S' typt
                if (karakter == 'S') {
                    System.exit(0);
                }
                karakterString = input.next();
                karakter = karakterString.charAt(0);

                isGeldigeOperator(karakter);
            }

            System.out.print("Eerste getal: ");
            double getal1 = input.nextDouble();
            System.out.println();

            System.out.print("Tweede getal: ");
            double getal2 = input.nextDouble();

            printBerekening(karakter, getal1, getal2);
        }

    }
    public static boolean isGeldigeOperator(char karakter) {

        final char OPERATOR_PLUS = '+';
        final char OPERATOR_MIN = '-';
        final char OPERATOR_KEER = '*';
        final char OPERATOR_DELEN = '/';
        final char OPERATOR_PROCENT = '%';

        // check of karakter geldig is, geeft true aan indien dat zo is en false als het niet zo is
        if (karakter != OPERATOR_PLUS && karakter != OPERATOR_MIN && karakter != OPERATOR_KEER &&
                karakter != OPERATOR_DELEN && karakter != OPERATOR_PROCENT ) {
            System.out.println("Operator is ongeldig");
            System.out.print("Operator (S = stoppen): ");
            return false;
        } else {
            return true;
        }
    }

    static void printBerekening(char operator, double getal1, double getal2) {
        double antwoord;
        switch (operator) {
            case '+' -> antwoord = getal1 + getal2;
            case '-' -> antwoord = getal1 - getal2;
            case '*' -> antwoord = getal1 * getal2;
            case '/' -> antwoord = getal1 / getal2;
            case '%' -> antwoord = getal1 % getal2;
            default -> antwoord = 0;
        }

        System.out.println((double)getal1 + " " + (char)operator + " " + (double)getal2 + " = " + antwoord);
    }
}
