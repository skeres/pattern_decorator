package com.sks.execution;

import com.sks.abstracts.Dessert;
import com.sks.classes.Chantilly;
import com.sks.classes.Chocolat;
import com.sks.classes.Gaufre;

public class Main {
    public static void main(String[] args) {
        System.out.println("begin");

        //creation gaufre simple
        Dessert gaufre = new Gaufre();
        System.out.println(gaufre);

        //Création et affichage d'une gaufre au chocolat.
        Dessert gaufre_chocolat = new Chocolat(gaufre);
        System.out.println(gaufre_chocolat);

        //Création et affichage d'une gaufre au chocolat + chantilly
        Dessert gaufre_chocolat_chantilly = new Chantilly(gaufre_chocolat);
        System.out.println(gaufre_chocolat_chantilly);

        System.out.println("end");
    }
}
