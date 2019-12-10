package Main;

import java.util.Random;

public class Dice {

    //this represents a single dice, with a set amount of sides, that uniformly is random to roll it

    private int sides;
    private boolean unrollable = false;

    private Dice() {
        //true every time, redundant
    }

    Dice(int sides) {
        if (sides == 0 || sides == 1) {
            unrollable = true;
        } else {
            this.sides = sides;
        }
    }

    public int rollN() {
        Random r = new Random();
        if (this.unrollable) {
            return 0;
        }else {
            return r.nextInt(sides) + 1;
        }
    }

    public static int roll(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }
}
