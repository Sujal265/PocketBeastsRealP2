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
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Deck implements Component {

     private String name;
     private final List<Component> components;
     private final ArrayList<Card> cards;


    public Deck(ArrayList<Card> cards) {
        this.cards = new ArrayList<>(cards);
        this.components = new ArrayList<>();
    }
    
   
    public int count() {
        return this.cards.size();
    }

    public Card draw() {
        return this.cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        this.cards.removeIf(c -> Objects.equals(c, card));
    }

    public void clear() {
        this.cards.clear();
    }
    public Deck(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
         this.components = new ArrayList<>();
    }
    
       public boolean contains(Card card) {
        return this.cards.contains(card);
    }

    @Override
    public void display() {
        System.out.println(name);
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    
    }
    
     @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

 
 
}
