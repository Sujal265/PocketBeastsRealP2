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

import static uk.ac.tees.cis2001.pocketbeasts.Main.getStarterDeck;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Player {
    
public static final int MAX_MANA = 9;

    private final String name;
    private int manaAvailable;
    private int manaTicker;
    private int health;
    private final Deck deck;
    private final Hand hand;
    private final InPlay inPlay;
    private final Graveyard graveyard;

    
   

    /**
     * Creates a new instance of the Player class with the specified name, deck, hand, inPlay, and graveyard.
     * @param name The name of the player.
     * @param deck The deck of cards for the player.
     * @param hand The hand of cards for the player.
     * @param inPlay The cards in play for the player.
     * @param graveyard The graveyard of cards for the player.
     */
    public Player(String name, Deck deck, Hand hand, InPlay inPlay, Graveyard graveyard) {
        this.name = name;
        this.manaAvailable = 0;
        this.manaTicker = 0;
        this.health = 15;
        this.deck = deck;
        this.hand = hand;
        this.inPlay = inPlay;
        this.graveyard = graveyard;
    }
    

 
   
  

    

    /**
     * Gets the name of the player.
     * @return The name of the player.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the amount of mana available to the player.
     * @return The amount of mana available to the player.
     */
  
  
  
    
    public int getManaAvailable() {
        return this.manaAvailable;
    }

    /**
     * Gets the current health of the player.
     * @return The current health of the player.
     */
    public int getHealth() {
        return this.health;
    }
    
    

    /**
     * Gets the deck of cards for the player.
     * @return The deck of cards for the player.
     */
    public Deck getDeck() {
        return this.deck;
    }

    /**
     * Gets the hand of cards for the player.
     * @return The hand of cards for the player.
     */
    public Hand getHand() {
        return this.hand;
    }

    /**
     * Gets the cards in play for the player.
     * @return The cards in play for the player.
     */
    public InPlay getInPlay() {
        return this.inPlay;
    }
    
    
    
      public void display() {
        System.out.println("Player");
        hand.display();
        deck.display();
        graveyard.display();
    }
    

    /**
     * Gets the graveyard of cards for the player.
     * @return The graveyard of cards for the player.
     */
    public Graveyard getGraveyard() {
        return this.graveyard;
    }
    
    public void addCardToHand(Hand hand) {
        this.hand.add(hand);
    }

    public void removeCardFromHand(Hand hand) {
        this.hand.remove(hand);
    }

    public void addCardToDeck(Deck deck) {
        this.deck.add(deck);
    }

    public void removeCardFromDeck(Deck deck) {
        this.deck.remove(deck);
    }

    public void addCardToGraveyard(Graveyard graveyard) {
        this.graveyard.add(graveyard);
    }

    public void removeCardFromGraveyard(Graveyard graveyard) {
        this.graveyard.remove(graveyard);
    }

    /**
     * Initializes a new game by shuffling the deck and drawing four cards.
     */
    public void newGame() {
        this.deck.shuffle();
        for (int i = 0; i < 4; i++) {
            this.hand.add(this.deck.draw());
        }
    }

    /**
     * Adds a mana crystal to the player's mana pool, up to a maximum of 9 mana crystals.
     */
    public void addMana() {
        if (this.manaTicker < MAX_MANA) {
            this.manaTicker++;
        }
        this.manaAvailable = manaTicker;
    }
    public void useMana(int amount) {
        if (amount > this.manaAvailable) {
            throw new IllegalArgumentException("Insufficient mana");
        }
        this.manaAvailable -= amount;
    }

    public void drawCard() {
        this.hand.add(this.deck.draw());
    }

    public Boolean damage(int amount) {
        this.health -= amount;
        return this.health <= 0;
    
    }
    
       public static String displayPlayer(Player player) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-9s HEALTH/%-5d MANA/%d\n", player.getName(), player.getHealth(), player.getManaAvailable()));

        for (int i=0; i<player.getInPlay().count()+2; i++) {
            sb.append("+-------+ ");
        }
        sb.append("\n");
        
        for (int i=0; i<2; i++) {
            sb.append("|       | ");
        }
        for (int i=0; i<player.getInPlay().count(); i++) {
            sb.append(String.format("|%7d| ", player.getInPlay().getCard(i).getManaCost()));
        }
        sb.append("\n");
        
        sb.append("| DECK  | ");
        sb.append("| GRAVE | ");
        for (int i=0; i<player.getInPlay().count(); i++) {
            sb.append(String.format("|%7s| ", ""));
        }
        sb.append("\n");
        
        for (int i=0; i<2; i++) {
            sb.append("|       | ");
        }
        for (int i=0; i<player.getInPlay().count(); i++) {
            sb.append(String.format("|%7s| ", ""));
        }
        sb.append("\n");
        
        for (int i=0; i<player.getInPlay().count()+2; i++) {
            sb.append("+-------+ ");
        }
        sb.append("\n");
        
        return sb.toString();
    }
       
 
   
}
