package com.company;

import java.util.Scanner;

public class W3BSAMonitor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int FYS_PUNTEN = 12;
        final int PROGRAMMING_PUNTEN = 3;
        final int DATABASES_PUNTEN = 3;
        final int PROJECTSKILLS_PUNTEN = 4;
        final int INFRASTRUCTURE_PUNTEN = 3;
        final int NETWORKENGINEERING_PUNTEN = 3;
        final int NUL_PUNTEN = 0;
        final double VOLDOENDE = 5.5;


        /* Welkom message */
        System.out.println("Hallo, bereken hier je studiepunten voor een overzicht van jou behaalde studiepunten dit jaar." +
                "\nVul je cijfers in met een komma (,) GEEN punt (.)");

        /* Input van user voor cijfer van vak FYS */
        double fys;
        System.out.print("Wat is jou cijfer voor Project Fasten Your Seatbelts: ");
        fys = input.nextDouble();

        /* Input van user voor cijfer van vak Programming */
        double programming;
        System.out.print("Wat is jou cijfer voor Programming: ");
        programming = input.nextDouble();

        /* Input van user voor cijfer van vak Databases */
        double databases;
        System.out.print("Wat is jou cijfer voor Databases: ");
        databases = input.nextDouble();

        /* Input van user voor cijfer van vak project & Skills */
        double projectSkills;
        System.out.print("Wat is jou cijfer voor Project & Skills: ");
        projectSkills = input.nextDouble();

        /* Input van user voor cijfer van vak Infrastructure */
        double infrastructure;
        System.out.print("Wat is jou cijfer voor Infrastructure: ");
        infrastructure = input.nextDouble();

        /* Input van user voor cijfer van vak Network Engineering */
        double networkEngineering;
        System.out.print("Wat is jou cijfer voor Network Engineering: ");
        networkEngineering = input.nextDouble();

        /* Bereken aantal studiepunten FYS */
        int fysStudiepunten;
        if (fys >= VOLDOENDE) {
            fysStudiepunten = FYS_PUNTEN;
        } else {
            fysStudiepunten = NUL_PUNTEN;
        }

        /* Bereken aantal studiepunten Programming */
        int programmingStudiepunten;
        if (programming >= VOLDOENDE) {
            programmingStudiepunten = PROGRAMMING_PUNTEN;
        } else {
            programmingStudiepunten = NUL_PUNTEN;
        }

        /* Bereken aantal studiepunten Databases */
        int databaseStudiepunten;
        if (databases >= VOLDOENDE) {
            databaseStudiepunten = DATABASES_PUNTEN;
        } else {
            databaseStudiepunten = NUL_PUNTEN;
        }

        /* Bereken aantal studiepunten Project & Skills */
        int projectSkillsStudiepunten;
        if (projectSkills >= VOLDOENDE) {
            projectSkillsStudiepunten = PROJECTSKILLS_PUNTEN;
        } else {
            projectSkillsStudiepunten = NUL_PUNTEN;
        }

        /* Bereken aantal studiepunten Infrastructure */
        int infrastructureStudiepunten;
        if (infrastructure >= VOLDOENDE) {
            infrastructureStudiepunten = INFRASTRUCTURE_PUNTEN;
        } else {
            infrastructureStudiepunten = NUL_PUNTEN;
        }

        /* Bereken aantal studiepunten Network Engineering */
        int networkEngineeringStudiepunten;
        if (networkEngineering >= VOLDOENDE) {
            networkEngineeringStudiepunten = NETWORKENGINEERING_PUNTEN;
        } else {
            networkEngineeringStudiepunten = NUL_PUNTEN;
        }

        /* (final) strings en ints voor output opmaak en berekeningen van totale aantal studiepunten. */
        final String VAK_PROJECT = "Vak/Project: ";
        final String CIJFER = "Cijfer: ";
        final String BEHAALD_PUNTEN = " Behaalde Punten: ";
        final int MAX_STUDIEPUNTEN = FYS_PUNTEN + PROGRAMMING_PUNTEN + DATABASES_PUNTEN + PROJECTSKILLS_PUNTEN + INFRASTRUCTURE_PUNTEN + NETWORKENGINEERING_PUNTEN;
        int totaalStudiepunten = fysStudiepunten + programmingStudiepunten + databaseStudiepunten + projectSkillsStudiepunten
                + infrastructureStudiepunten + networkEngineeringStudiepunten;


        /* output van systeem die aangeeft wat je cijfer is per vak + studiepunten */
        System.out.println("\n");
        System.out.println(VAK_PROJECT + "Fasten Your Seatbelts" + "\t\t\t" + CIJFER + fys + BEHAALD_PUNTEN + fysStudiepunten);
        System.out.println(VAK_PROJECT + "Programming" + "\t\t\t\t\t" + CIJFER + programming + BEHAALD_PUNTEN + programmingStudiepunten);
        System.out.println(VAK_PROJECT + "Databases" + "\t\t\t\t\t\t" + CIJFER + databases + BEHAALD_PUNTEN + databaseStudiepunten);
        System.out.println(VAK_PROJECT + "Personal & Project skills" + "\t\t" + CIJFER + projectSkills + BEHAALD_PUNTEN + projectSkillsStudiepunten);
        System.out.println(VAK_PROJECT + "Infrastructure" + "\t\t\t\t\t" + CIJFER + infrastructure + BEHAALD_PUNTEN + infrastructureStudiepunten);
        System.out.println(VAK_PROJECT + "Network Engineering" + "\t\t\t" + CIJFER + networkEngineering + BEHAALD_PUNTEN + networkEngineeringStudiepunten);

        System.out.println("\nIn totaal heb je: " + totaalStudiepunten + "/" + MAX_STUDIEPUNTEN + " studiepunten");

        final int MINIMAAL_BEREKENING_NOEMER = 6;
        final int MINIMAAL_BEREKENING_TELLER = 5;
        double minimumStudiepunten = ((double)MAX_STUDIEPUNTEN / MINIMAAL_BEREKENING_NOEMER) * (double)MINIMAAL_BEREKENING_TELLER;

        if (totaalStudiepunten >= minimumStudiepunten ) {
            System.out.println("LET OP: Je ligt op schema voor een positief BSA!");
        } else if (totaalStudiepunten <= minimumStudiepunten){
            System.out.println("LET OP: Je ligt op schema voor een negatief BSA!");
        } else {
            System.out.println("Berekenen van positief of negatief advies is mislukt. Probeer het later opnieuw.");
        }
    }
}
