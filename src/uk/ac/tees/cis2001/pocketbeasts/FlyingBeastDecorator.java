/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author sujalnagpal
 */
public class FlyingBeastDecorator extends BeastDecorator{
    
    private int flightSpeed;

    public FlyingBeastDecorator(Beast decoratedBeast, int flightSpeed) {
        super(decoratedBeast);
        this.flightSpeed = flightSpeed;
    }

    @Override
    public int getStrength() {
        // Add a bonus to strength for flying beasts
        return super.getStrength() + 2;
    }

    @Override
    public int getDefense() {
        // Add a bonus to defense for flying beasts
        return super.getDefense() + 2;
    }
    
   
    public int getAttack() {
        // Add a bonus to defense for flying beasts
        return 0;
    }

    @Override
    public String getName() {
        // Add a prefix to the name of flying beasts
        return "Flying " + super.getName();
    }

    public int getFlightSpeed() {
        return flightSpeed;
    }
    
}
