/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package uk.ac.tees.cis2001.pocketbeasts;

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
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
       
            System.out.println("testGetName");
    System.out.println("testGetName");
    
    String expResult = "Alice";
    String result = getName("James");
    assertEquals(expResult, result);
 
    }

    /**
     * Test of getManaAvailable method, of class Player.
     */
    @Test
    public void testGetManaAvailable() {
        System.out.println("getManaAvailable");
        Player instance = null;
        int expResult = 0;
        int result = instance.getManaAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHealth method, of class Player.
     */
    @Test
    public void testGetHealth() {
        System.out.println("getHealth");
        Player instance = null;
        int expResult = 0;
        int result = instance.getHealth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeck method, of class Player.
     */
    @Test
    public void testGetDeck() {
        System.out.println("getDeck");
        Player instance = null;
        Deck expResult = null;
        Deck result = instance.getDeck();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Player instance = null;
        Hand expResult = null;
        Hand result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInPlay method, of class Player.
     */
    @Test
    public void testGetInPlay() {
        System.out.println("getInPlay");
        Player instance = null;
        InPlay expResult = null;
        InPlay result = instance.getInPlay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraveyard method, of class Player.
     */
    @Test
    public void testGetGraveyard() {
        System.out.println("getGraveyard");
        Player instance = null;
        Graveyard expResult = null;
        Graveyard result = instance.getGraveyard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newGame method, of class Player.
     */
    @Test
    public void testNewGame() {
        System.out.println("newGame");
        Player instance = null;
        instance.newGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMana method, of class Player.
     */
    @Test
    public void testAddMana() {
        System.out.println("addMana");
        Player instance = null;
        instance.addMana();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of useMana method, of class Player.
     */
    @Test
    public void testUseMana() {
        System.out.println("useMana");
        int amount = 0;
        Player instance = null;
        instance.useMana(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawCard method, of class Player.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Player instance = null;
        instance.drawCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of damage method, of class Player.
     */
    @Test
    public void testDamage() {
        System.out.println("damage");
        int amount = 0;
        Player instance = null;
        Boolean expResult = null;
        Boolean result = instance.damage(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayPlayer method, of class Player.
     */
    @Test
    public void testDisplayPlayer() {
        System.out.println("displayPlayer");
        Player player = null;
        String expResult = "";
        String result = Player.displayPlayer(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private String getName(String james) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
