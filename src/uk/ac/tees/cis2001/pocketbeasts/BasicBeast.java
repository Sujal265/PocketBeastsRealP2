/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author sujalnagpal
 */
public class BasicBeast implements Beast {
    
    private String name;
    private int strength;
    private int defense;
    private int health;
    private int Attack;

    public BasicBeast(String name, int strength, int defense, int health, int Attack) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.health = health;
        this.health = Attack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public int getHealth() {
        return health;
    }
    
    @Override
    public int getAttack() {
        return Attack;
    }
}
