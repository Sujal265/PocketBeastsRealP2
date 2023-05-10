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
import java.util.List;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Graveyard implements Component{
    private String name;
    private final ArrayList<Card> cards;
    private final List<Component> components;

    /**
     * Constructs a new, empty graveyard.
     */
    public Graveyard() {
        this.cards = new ArrayList<>();
        this.components = new ArrayList<>();
    }
    
    /**
     * Adds a card to the graveyard.
     *
     * @param card The card to be added to the graveyard.
     */
    public void add(Card card) {
        this.cards.add(card);
    }
    
    /**
     * Returns the number of cards in the graveyard.
     *
     * @return The number of cards in the graveyard.
     */
    public int count() {
        return this.cards.size();
    }
    
    /**
     * Returns a new list containing all the cards in the graveyard.
     *
     * @return A new list containing all the cards in the graveyard.
     */
    public List<Card> getCards() {
        return new ArrayList<>(this.cards);
    }
    
       public Graveyard(String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.cards = new ArrayList<>();
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
        System.out.println("Graveyard: " + this.name);
        for (Component component : this.components) {
            component.display();
        }
    }
}
