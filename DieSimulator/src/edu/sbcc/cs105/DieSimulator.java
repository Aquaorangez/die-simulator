/**
 * @author Mick Campitelli
 */
package edu.sbcc.cs105;
 
import java.util.*;
 
/**
 * This class simulates rolling a die by generating a random number between 1
 * and 6 inclusive.
 *
 */
public class DieSimulator {
 
    /**
     * Simulates the die roll.
     *
     * @return a random integer from 1 to 6 inclusive.
     */
    public int rollTheDie() {
        int randomDieRoll = 0;
        
        Random die = new Random();
        randomDieRoll = die.nextInt(6)+1;
 
        return randomDieRoll;
    }
}