package com.company;

import java.util.Scanner;

public class W4DobbelSteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String dobbelsteenString = "";

        System.out.print("Hallo, wel karakter moet gebruikt worden voor de dobbelsteen: ");
        dobbelsteenString= input.next();

        char dobbelsteenChar = dobbelsteenString.charAt(0);

        int worpGetal = 1;
        do {
            worpGetal = (int)(Math.random() * 6) + 1;

            switch (worpGetal) {
                case 1:
                    System.out.println("Het getal is 1");
                    System.out.println(dobbelsteenChar + "\t" + "\t\n");
                    System.out.println("\t" + "\t" + "\t\n");
                    System.out.println("\t" + "\t" + "\t\n");
                    break;
                case 2:
                    System.out.println("Het getal is 2");
                    System.out.println(dobbelsteenChar + "\t" + "\t\n");
                    System.out.println("\t" + "\t" + "\t\n");
                    System.out.println("\t" + "\t" + dobbelsteenChar + "\n");
                    break;
                case 3:
                    System.out.println("Het getal is 3");
                    System.out.println(dobbelsteenChar + "\t" + "\t\n");
                    System.out.println("\t" + dobbelsteenChar + "\t\n");
                    System.out.println("\t" + "\t" + dobbelsteenChar + "\n");
                    break;
                case 4:
                    System.out.println("Het getal is 4");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    System.out.println("\t" + "\t" + "\t\n");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    break;
                case 5:
                    System.out.println("Het getal is 5");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    System.out.println("\t" + dobbelsteenChar + "\t\n");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    break;
                case 6:
                    System.out.println("Getal is 6, je hebt gewonnen!");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    System.out.println(dobbelsteenChar + "\t" + dobbelsteenChar + "\n");
                    break;
                default:
                    System.out.println("Error, restart spel");
                    break;
            }

        } while (worpGetal != 6);
    }
}
