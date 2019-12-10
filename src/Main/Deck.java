package Main;

import java.util.Random;

public class Deck {

    private Card[] deck;
    private int top = -1;

    public Deck() {
        //default deck is 52 cards
        deck = new Card[52]; // this makes 0 cards, they are only references
        //generate "standard" deck of cards
        int i = 0;
        for (int suite = 1; suite <= 4; suite++) {
            for (int value = 1; value <= 13; value++) {
                //Card c = new Card(value, suite);
                deck[i++] = new Card(value, suite);
            }
        }
    }

    public void shuffle () {
        Random rn = new Random();

        for (int i = 0; i < 52; ++i) {
            int pos = rn.nextInt(52);
            Card temp = deck[i];
            deck[i] = deck[pos];
            deck[pos] = temp;
        }
    }

    public Card deal() throws ArrayIndexOutOfBoundsException {
        // -- throw empty deck exception --
        if (top == 51) {
            throw new ArrayIndexOutOfBoundsException("empty deck");
        }
        ++top;
        return deck[top];
    }

    public String toString() {
        String s = "";
        for (Card c : deck) {
            s += c + "\n";
        }
        return s;
    }

    public static void main(String[] args) {

        Deck deck = new Deck();
        /*
        for (int i = 0; i < 52; ++i) {
            Card c = deck.deal();
            */
            System.out.println(deck);
        //}

        System.out.println("==============");
        deck.shuffle();
        System.out.println(deck);
    }

}
