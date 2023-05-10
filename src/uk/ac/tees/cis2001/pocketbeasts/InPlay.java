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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class InPlay implements Component{
        private final String name;

    
    /** The list of cards that are currently in play. */
    private final List<Card> cards;
      private final List<Component> components;

    /**
     * Constructs a new instance of the InPlay class.
     */
    public InPlay() {
        this.name = "";
        this.cards = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    /**
     * Gets the list of cards that are currently in play.
     * @return The list of cards that are currently in play.
     */
    public List<Card> getCards() {
        return cards;
    }
    
    

    /**
     * Gets a card from the list of cards that are currently in play.
     * @param index The index of the card to get.
     * @return The card at the specified index.
     */
    public Card getCard(int index) {
        return cards.get(index);
    }

    /**
     * Adds a card to the list of cards that are currently in play.
     * @param card The card to add.
     */
    public void add(Card card) {
        this.cards.add(card);
    }
    
     public InPlay(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    /**
     * Removes a card from the list of cards that are currently in play.
     * @param card The card to remove.
     */
    public void remove(Card card) {
        this.cards.remove(card);
    }

    /**
     * Removes all cards from the list of cards that are currently in play.
     * @param cards The collection of cards to remove.
     */
    public void removeAll(Collection<Card> cards) {
        this.cards.removeAll(cards);
    }

    /**
     * Gets the number of cards that are currently in play.
     * @return The number of cards that are currently in play.
     */
    public int count() {
        return this.cards.size();
    }
    
    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("InPlay: " + this.name);
        for (Component component : this.components) {
            component.display();
        }
    }
}
