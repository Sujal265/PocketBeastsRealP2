/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author sujalnagpal
 */
public abstract class BeastDecorator implements Beast{
    
    private Beast decoratedBeast;

    public BeastDecorator(Beast decoratedBeast) {
        this.decoratedBeast = decoratedBeast;
    }

    @Override
    public String getName() {
        return decoratedBeast.getName();
    }

    @Override
    public int getStrength() {
        return decoratedBeast.getStrength();
    }

    @Override
    public int getDefense() {
        return decoratedBeast.getDefense();
    }

    @Override
    public int getHealth() {
        return decoratedBeast.getHealth();
    }
    
}
