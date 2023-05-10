/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author sujalnagpal
 */
public class DeckTest {
    
 private Deck deck;
    private Card card1;
    private Card card2;
    private Card card3;

    @Before
    public void setUp() {
        // Create a new deck with some cards
        ArrayList<Card> cards = new ArrayList<>();
        card1 = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS, "001", "PocketBeast", 2, 3, 4);
        card2 = new Card(Card.Rank.SIX, Card.Suit.HEARTS, "002", "FireDragon", 5, 6, 7);
        card3 = new Card(Card.Rank.QUEEN, Card.Suit.SPADES, "003", "IceGolem", 8, 9, 10);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        this.deck = new Deck(cards);
    }

    @Test
    public void testCount() {
        int expResult = 3;
        int result = deck.count();
        assertEquals(expResult, result);
    }

    @Test
    public void testDraw() {

    Card expResult = card1;
    Card result = deck.draw();
    assertEquals(expResult, result);
    }

    @Test
    public void testShuffle() {
        // No easy way to test this, so we'll just make sure it doesn't throw an exception
        deck.shuffle();
    }

    @Test
    public void testAddCard() {
        Card newCard = new Card(Card.Rank.FIVE, Card.Suit.CLUBS, "004", "WaterElemental", 3, 4, 5);
        deck.addCard(newCard);
        assertTrue(deck.contains(newCard));
    }

    @Test
    public void testRemoveCard() {
        deck.removeCard(card2);
        assertFalse(deck.contains(card2));
    }

    @Test
    public void testClear() {
        deck.clear();
        int expResult = 0;
        int result = deck.count();
        assertEquals(expResult, result);
    }

    @Test
    public void testToString() {
          // Create a new deck with some cards
    String expResult = "FireDragon of HEARTS (6/7/5)\nIceGolem of SPADES (4/5/3)\nWaterElemental of CLUBS (5/6/4)\n";
    String result = deck.toString();
    assertEquals(expResult, result);
    }
}