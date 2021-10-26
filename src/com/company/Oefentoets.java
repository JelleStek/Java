package com.company;

import java.util.Scanner;

/*
* @author Jelle Stekelenburg
* Applicatie die er voor zorgt dat een gebruiker kan inzien wat hij verdient en overhoud met zijn invertaris (min 1 item max 25 items)
* */

public class Oefentoets {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MIN_AANTAL_ONDERDELEN = 1;
        final int MAX_AANTAL_ONDERDELEN = 25;

        //Naam, Klasnummer & Studentnummer
        System.out.println("Dit programma is gemaakt door Jelle Stekelenburg, IS110, 500864454 \n\n");

        System.out.print("Hoeveel computeronderdelen wil je verkopen? ");
        int aantalOnderdelen = input.nextInt();

        while(aantalOnderdelen < MIN_AANTAL_ONDERDELEN || aantalOnderdelen > MAX_AANTAL_ONDERDELEN) {
            System.out.println("\tAantal onderdelen moet tussen de 1 en 25 liggen");
            System.out.print("Hoeveel computeronderdelen wil je verkopen? ");
            aantalOnderdelen = input.nextInt();
        }

        //spacing
        System.out.println();

        String[] onderdelen = new String[aantalOnderdelen];
        System.out.println("Geef per onderdeel de omschrijving:");
        //buffer legen
        input.nextLine();
        //loop onderdelen
        for(int aantal = 0; aantal < aantalOnderdelen; aantal++) {
            System.out.print("\t" + (aantal + 1) + ": ");
            onderdelen[aantal] = input.nextLine();
        }

        double[] onderdelenPrijs = new double[aantalOnderdelen];
        System.out.println("Geef per onderdeel de verkoopprijs: ");
        //loop onderdelenPrijs
        for(int aantal = 0; aantal < aantalOnderdelen; aantal++) {
            System.out.print("\tprijs " + onderdelen[aantal] + ": ");
            onderdelenPrijs[aantal] = input.nextDouble();
        }


        //output
        System.out.println("De totaalrpijs van alle onderdeelen bedraagt: " + berekenTotaalprijs(onderdelenPrijs));
        System.out.println("Hiervoor betaalt u aan verkoopkosten: " + berekenVerkoopkosten(berekenTotaalprijs(onderdelenPrijs)));
        double totaalMinVerkoop = berekenTotaalprijs(onderdelenPrijs) - berekenVerkoopkosten(berekenTotaalprijs(onderdelenPrijs));
        System.out.println("Indien alle onderdelen worden verkocht, ontvangt u: " + totaalMinVerkoop + "\n");

        System.out.println("Lijst van onderdelen");
        for(int aantal = 0; aantal <aantalOnderdelen; aantal++) {
            System.out.printf("%-20s %6.2f \n", onderdelen[aantal], onderdelenPrijs[aantal]);
        }
    }
    public static double berekenTotaalprijs(double[] prijzen) {

        double totaalPrijs = 0;
        for(int aantal = 0; aantal < prijzen.length; aantal++) {
            totaalPrijs += prijzen[aantal];
        }
        return totaalPrijs;
    }

    public static int berekenVerkoopkosten(double totaalprijs) {
        final int HONDERD_PROCENT = 100;
        final int VERKOOP_KOSTEN_PROCENT = 5;
        final int MINIMUN_KOSTEN = 3;

        int verkoopKosten = (int) ((totaalprijs / HONDERD_PROCENT) * VERKOOP_KOSTEN_PROCENT);

        if (verkoopKosten < MINIMUN_KOSTEN) {
            verkoopKosten = MINIMUN_KOSTEN;
        }

        return verkoopKosten;
    }
}
