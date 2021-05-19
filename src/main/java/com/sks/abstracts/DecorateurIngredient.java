package com.sks.abstracts;

// Classe abstraite decorateurIngredient qui hérite de dessert.
public abstract class DecorateurIngredient extends Dessert
{
    protected Dessert dessert;// Dessert sur lequel on applique l'ingrédient => ON VA LE DECORER !!

    // On oblige les ingrédients à implémenter la méthode getLibelle().
    public abstract String getLibelle();
    // On oblige les ingrédients à implémenter la méthode getPrix().
    public abstract double getPrix();
}
