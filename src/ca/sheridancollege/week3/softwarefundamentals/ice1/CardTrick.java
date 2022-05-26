/* Modifier: Thi Thanh Van Pham
 * Student ID: 991660204
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author ----
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (13 * Math.random()+1));

            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(4 * Math.random())]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit(Card.SUITS[3]);
        
        // flag to determine winning or not
        boolean isLucky = false;
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)  {
            Card tempCard = magicHand[i];
        //Then report the result here
        if(tempCard.getValue() == luckyCard.getValue() 
                && tempCard.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                isLucky = true;
            }
        }
        if (isLucky) {
            System.out.println("You are winning!");
        } else {
            System.out.println("You are losing!");
        }
    }
    
}
