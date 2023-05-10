/*
 * This file is part of PocketBeasts.
 *
 * PocketBeasts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PocketBeasts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.UUID;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Card implements Comparable<Card> {




    

 public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}
    public enum Suit {
    HEARTS, SPADES, CLUBS, DIAMONDS
}

 private final Rank rank;
    private final Suit suit;
    private final String id;
    private final String name;
    private final int manaCost;
    private final int attack;
    private int health;
    
    public Card(Rank rank, Suit suit, String id, String name, int manaCost, int attack, int health) {
        this.rank = rank;
        this.suit = suit;
        this.id = id;
        this.name = name;
        this.manaCost = manaCost;
        this.attack = attack;
        this.health = health;
    }
    
    public Card(Card card) {
        this.rank = card.rank;
        this.suit = card.suit;
        this.id = card.id;
        this.name = card.name;
        this.manaCost = card.manaCost;
        this.attack = card.attack;
        this.health = card.health;
    }
    
    public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    this.id = UUID.randomUUID().toString(); // generate a unique ID for the card
    this.name = rank.toString() + " of " + suit.toString();
    this.manaCost = rank.ordinal() + 1; // mana cost is equal to the rank value + 1
    this.attack = rank.ordinal() + 1; // attack value is equal to the rank value + 1
    this.health = rank.ordinal() + 1; // health value is equal to the rank value + 1
}
    
   public Rank getRank() {
        return this.rank;
    }
    
    public Suit getSuit() {
        return this.suit;
    }
    
    public Card(String name) {
        this.name = name;
         this.rank = null;
    this.suit = null;
    this.id = UUID.randomUUID().toString();
    this.manaCost = 0;
    this.attack = 0;
    this.health = 0;
    }
    /**
     * Returns the ID of the card.
     */
    public String getId() {
        return this.id;
    }
    
    /**
     * Returns the name of the card.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the mana cost of the card.
     */
    public int getManaCost() {
        return this.manaCost;
    }
    
    /**
     * Returns the attack value of the card.
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * Returns the health value of the card.
     */
    public int getHealth() {
        return this.health;
    }
    
    /**
     * Reduces the health of the card by the given amount.
     */
    public Card damage(int amount) {
        return new Card(this.rank, this.suit, this.id, this.name, this.manaCost, this.attack, this.health - amount);
    }

    /**
     * Returns a String representation of the card, including its name, ID, mana cost, attack value, and health value.
     */
    @Override
    public String toString() {
        String formattedManaCost = String.format("%02d", this.manaCost);
        return this.name + " (" + this.id + ")[ Mana Cost: " + formattedManaCost + " Attack: " + this.attack + " Health: " + this.health + "]";
    }

    /**
     * Compares this card to another card based on their mana cost values.
     */
    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.getManaCost(), o.getManaCost());
        
     
    }
    @Override
public boolean equals(Object obj) {
    if (obj == this) { // check if the object is the same as this one
        return true;
    }
    if (!(obj instanceof Card)) { // check if the object is a Card
        return false;
    }
    Card card = (Card) obj; // cast the object to a Card
    return this.name.equals(card.name); // compare the names
}
   
   
   }
