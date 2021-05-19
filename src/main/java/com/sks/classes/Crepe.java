package com.sks.classes;

import com.sks.abstracts.Dessert;

// Classe crêpe qui hérite de dessert.
public class Crepe extends Dessert
{
    // Constructeur qui initialise le libellé et le prix.
    public Crepe()
    {
        setLibelle("Crêpe");
        setPrix(1.50);
    }
}
