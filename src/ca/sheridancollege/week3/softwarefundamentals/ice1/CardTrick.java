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
        Scanner input = new Scanner (System.in);
        System.out.printf("%40s","Please enter the card value from 1-13: ");
        int cardValue;
        try{
            cardValue = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error! You must enter number from 1 to 13!");
            return;
        }
        
        System.out.printf("%40s","Please enter 0 for Hearts, 1 for Diamonds"
                + "2 for Spades and 3 for Clubs: ");
        int cardSuitNumber;
        try{
            cardSuitNumber = input.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Error! You must enter number from 0 to 3!");
            return;
        }
        
        String cardSuit = Card.SUITS[cardSuitNumber];
        System.out.println("Your card is " + cardValue +" " + cardSuit);
        
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)  {
            Card tempCard = magicHand[i];
        //Then report the result here
        if(tempCard.getValue() == cardValue && tempCard.getSuit().equalsIgnoreCase(cardSuit)) {
                System.out.println("Your card is in the magic hand of random " +
                        "cards!");
            } else {
                System.out.println("Your card is not in the magic hand of " +
                        "random card!");
            }
        }
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit(Card.SUITS[3]);
    }
    
}
