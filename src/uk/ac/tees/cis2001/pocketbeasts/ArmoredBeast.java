/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author sujalnagpal
 */
public abstract class ArmoredBeast extends BeastDecorator{
    
     private int armor;

    public ArmoredBeast(Beast decoratedBeast, int armor) {
        super(decoratedBeast);
        this.armor = armor;
    }

    @Override
    public int getDefense() {
        return super.getDefense() + armor;
    }
    
}
