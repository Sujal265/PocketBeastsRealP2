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

/**
 *
 * @author James Fairbairn
 * @author Steven Mead
 */
public class Hand implements Component{
    
    private String name;
     private final List<Component> components;
    

    
    private final ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
        this.components = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
        this.sort();
    }

    public void addAll(List<Card> cards) {
        this.cards.addAll(cards);
        this.sort();
    }

        public Hand(String name) {
        this.name = name;
          this.cards = new ArrayList<>();
        this.components = new ArrayList<>();
    }
       
    public void remove(Card card) {
        this.cards.remove(card);
        
    }

    public void removeAll(List<Card> cards) {
        this.cards.removeAll(cards);
    }

    public int count() {
        return this.cards.size();
    }
    public int getSize() {
    return cards.size();
}
    
    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < cards.size(); i++) {
        sb.append(cards.get(i).toString());
        if (i < cards.size() - 1) {
            sb.append(" ");
        }
    }
    sb.append("]");
    return sb.toString();
    }

    private void sort() {
        Collections.sort(this.cards);
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
        System.out.println("Hand: " + this.name);
        for (Component component : this.components) {
            component.display();
        }
    }
  

   
}
