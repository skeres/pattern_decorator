package com.sks.classes;

import com.sks.abstracts.Dessert;

// Classe gaufre qui hérite de dessert
public class Gaufre extends Dessert
{
    // Constructeur qui intialise le libellé et le prix.
    public Gaufre()
    {
        setLibelle("Gaufre");
        setPrix(1.80);
    }
}
