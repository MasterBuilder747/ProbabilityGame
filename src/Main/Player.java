package Main;

public class Player {

    private Card[] hand;
    private String name;
    private int nCards;

    private Player () {

    }
    public Player (String name) {
        this.name = name;
        hand = new Card[5];
        nCards = 0;
    }

    public String toString() {
        String s = name + "\n";
        for (int i = 0; i < nCards; ++i) {
            s += hand[i] + "\n";
        }
        s += total();
        return s;
    }

    public String getName() {
        return name;
    }

    public int total() {
        int sum = 0;
        for(int i = 0; i < nCards; ++i) {
            sum += hand[i].getValue();
        }
        return sum;
    }

    public boolean handFull() {
        return nCards == 5;
    }

    public void receiveCard(Card c) throws ArrayIndexOutOfBoundsException {
        if (nCards >= 5) {
            throw new ArrayIndexOutOfBoundsException("too many cards");
        }
        hand[nCards++] = c; //insert the card into the hand, then increase the number of cards
    }

}
