package com.company;

import java.util.Scanner;

public class W2Verkoopprijs {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double inkoopPrijs = 0;
        double winstMarge = 0;
        double verkoopPrijsZonderBtw = 0;

        final int BTW_HOOG = 21;
        final int BTW_LAAG = 6;
        final int EEN_PROCENT_VAN_VOLLE_PRIJS_CALC = 100;

        System.out.print("Hallo! \nWelkom bij prijs calculator XL \nGebruik een komma en GEEN punt.\n\n");

        System.out.print("Inkoop prijs van het nieuwe product: ");
        inkoopPrijs = input.nextDouble();

        System.out.print("Winstmarge van het product (alleen cijfers, geen\"%\" teken) \nwinstmarge is de hoeveelheid % + prijs van de inkoop: ");
        winstMarge = input.nextDouble();

        System.out.print("\n");

        verkoopPrijsZonderBtw = (inkoopPrijs / EEN_PROCENT_VAN_VOLLE_PRIJS_CALC) * winstMarge + inkoopPrijs;

        double verkoopPrijsMetLaagBtw = (verkoopPrijsZonderBtw / EEN_PROCENT_VAN_VOLLE_PRIJS_CALC) * BTW_LAAG + verkoopPrijsZonderBtw;
        double metLaagBtw = (verkoopPrijsZonderBtw / EEN_PROCENT_VAN_VOLLE_PRIJS_CALC) * BTW_LAAG;
        double verkoopPrijsMetHoogBtw = (verkoopPrijsZonderBtw / EEN_PROCENT_VAN_VOLLE_PRIJS_CALC) * BTW_HOOG + verkoopPrijsZonderBtw;
        double metHoogBtw = (verkoopPrijsZonderBtw / EEN_PROCENT_VAN_VOLLE_PRIJS_CALC) * BTW_HOOG;

        System.out.println("Verkoop prijs zonder btw: €" + verkoopPrijsZonderBtw + ",-");
        System.out.println("Verkoop prijs met 9% BTW: €" + verkoopPrijsMetLaagBtw + ",- (BTW: €" + metLaagBtw + ",-)");
        System.out.println("Verkoop prijs met 21% BTW: €" + verkoopPrijsMetHoogBtw + ",- (BTW: €" + metHoogBtw + ",-)");
    }
}
