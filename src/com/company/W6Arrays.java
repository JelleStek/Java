package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class W6Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUL = 0;
        final int AANTAL_VAKKEN = 4;
        final String[] VAKKEN = {"Fasten Your Seatbelt", "Programming", "Personal & Project Skills", "User Interaction"};
        final int[] VAKKEN_MAX_PUNTEN = {12, 3, 3, 3};
        final double[] VAKKEN_CIJFERS = new double[AANTAL_VAKKEN];

        System.out.println("Voer behaalde cijfers in:");

        for(int i=NUL; i < AANTAL_VAKKEN; i++) {
            System.out.print(VAKKEN[i] + ": ");
            VAKKEN_CIJFERS[i] = input.nextDouble();
        }

        final double VOLDOENDE = 5.5;
        int behaaldePuntenVoorVak[] = new int[AANTAL_VAKKEN];

        for (int i=NUL; i < AANTAL_VAKKEN; i++) {
            if (VAKKEN_CIJFERS[i] >= VOLDOENDE) {
                behaaldePuntenVoorVak[i] = VAKKEN_MAX_PUNTEN[i];
            } else {
                behaaldePuntenVoorVak[i] = 0;
            }
        }
        //spacing maken voor output
        System.out.print("\n\n");

        for (int i=0; i < AANTAL_VAKKEN; i++) {
            System.out.printf("%-8s %-28s %-8s %-6.1f %-8s %2d ",
            "Vakken/Project: ", VAKKEN[i], "Cijfer: ", VAKKEN_CIJFERS[i], "Behaalde punten: ", behaaldePuntenVoorVak[i]);
        }
    }
}
