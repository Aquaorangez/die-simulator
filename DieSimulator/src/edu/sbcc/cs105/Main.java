/**
 * @author Mick Campitelli
 */
package edu.sbcc.cs105;
 
/**
 * This class tests the DieSimulator object.
 *
 */
public class Main {
 
    /**
     * This method creates a DieSimulator object and repeatedly invokes its
     * rollTheDie method. Tested enough, this method should determine whether the die
     * works correctly.
     *
     * @param args
     *            command line values. Not used in this example.
     */
    public static void main(String[] args) {
        DieSimulator ds = new DieSimulator();
 
        System.out.println("One die roll is " + ds.rollTheDie());
        System.out.println("Another die roll is " + ds.rollTheDie());
        System.out.println("Yet another die roll is  " + ds.rollTheDie());
        System.out.println("Last test die roll is " + ds.rollTheDie());
       
    }
 
}