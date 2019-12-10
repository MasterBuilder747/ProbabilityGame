package Main;

import java.util.Scanner;

public class BlackJack {

    Player players[];
    Player dealer;
    Deck deck;

    public BlackJack()
    {
        int nPlayers = 1;
        players = new Player[nPlayers];
        for (int i = 0; i < nPlayers; ++i) {
            players[i] = new Player("Player " + i);
        }
        dealer = new Player("Dealer");

        deck = new Deck();
        deck.shuffle();

        // -- deal the initial hands
        try {
            for (int j = 0; j < 2; ++j) {
                for (int i = 0; i < nPlayers; ++i) {
                    players[i].receiveCard(deck.deal());
                }
                Card c = deck.deal();
                dealer.receiveCard(c);
                if (j == 1) { //if second card, show it
                    System.out.println("Dealer shows " + c);
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of cards");
        }

    }

    public BlackJack(int nPlayers) throws IllegalArgumentException {
        if (nPlayers > 5) {
            throw new IllegalArgumentException("too many players");
        }
        deck = new Deck(); //create deck
        deck.shuffle(); //shuffle it
        players = new Player[nPlayers]; //create players
        for (int i = 0; i < nPlayers; ++i) {
            players[i]=  new Player("Player" + i);
        }
        dealer = new Player("Dealer"); //create dealer

        // -- deal the initial hands --
        try {
            for (int j = 0; j < 2; ++j) {
                for (int i = 0; i < nPlayers; ++i) {
                    players[i].receiveCard(deck.deal());
                }
                Card c = deck.deal();
                dealer.receiveCard(deck.deal());
                if (j == 1) { //if second card, show it
                    System.out.println("Dealer shows " + c);
                }
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of cards");
        }
    }

    public void play() {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < players.length; ++i) {
            boolean wantCard;
            System.out.println(players[i].getName() + " do you want a card? (y or n) ");
            String response = kb.next().toLowerCase();
            while (response.equals("y")) {
                //.equals: if the object is equals to this one
                //refer to the same object
                //only looks at the stack when processing the comparision

            }
        }
    }

    public void printHands() {
        for (Player p : players) {
            System.out.println(p);
        }
        System.out.println(dealer);
    }

    public static void main(String[] args) {

        //the actual game
        try {
            BlackJack game = new BlackJack();
            game.printHands();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you've got to be kidding me");
        }

    }

}