package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author khushpreet singh
 * @author khushpreet singh Jan 25, 2022 
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        // Fill the hand array with random cards
        Random random = new Random();
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(10) + 1); // Values from 1 to 10
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from 0 to 3
            hand[i] = card;
        }

        // Ask the user for a card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card value (1-10): ");
        int userValue = scanner.nextInt();
        System.out.print("Pick a suit (1-Hearts, 2-Diamonds, 3-Clubs, 4-Spades): ");
        int userSuit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit - 1]); // Adjusting for 0-based array

        // Search for the user's card in the hand
        boolean matchFound = false;
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        // If the guess is successful, invoke the printInfo() method
        if (matchFound) {
            printInfo();
        }
    }
    private static void printInfo() {
        /*i am done*/
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is khushpreet singh");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("to be web developer");
        System.out.println("Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("portrait making");
        System.out.println("singhing");
        System.out.println("watching movies");
        System.out.println("Riding my motorcycle");

        System.out.println();
        
    
    }

}
