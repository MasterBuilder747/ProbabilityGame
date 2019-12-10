package DnD;

import java.util.Random;
import java.util.Scanner;

public class MathProject {

    public static void main(String[] args) {
        System.out.println("Welcome to Adventures of Exploration!!");
        System.out.println("Bet $10, win:");
        System.out.println("Choose your class: 1 = Mage ($13), 2 = Knight ($18), 3 = Barbarian ($36), 4 = Archer ($60), 5 = Ranger($75)");
        Scanner s = new Scanner(System.in);
        try {
            play(s.nextInt());
        }catch (Exception e) {
            System.out.println("Invalid input. Exiting.");
        }
    }

    public static boolean play(int character) {

        int sides = 0;
        switch (character) {
            case 1: {
                return playing(6, 3, 3, 3);
            }
            case 2: {
                return playing(8, 4, 4, 5);
            }
            case 3: {
                return playing(10, 6, 6, 7);
            }
            case 4: {
                return playing(12, 8, 9, 8);
            }
            case 5: {
                return playing(20, 14, 14, 15);
            }
            default: {
                System.out.println("error");
                return false;
            }
        }
    }

    public static boolean playing(int sides, int case1, int case2, int case3) {
        //first move
        int r1 = roll(sides);
        System.out.println("1st roll: you got a: " + r1);
        if (r1 > case1) {
            System.out.println("Awesome! Move your character forward!");
        }else {
            System.out.println("Aww! You lost the adventure!");
            return false;
        }
        //second move
        int r2 = roll(sides);
        System.out.println("2nd roll: you got a: " + r2);
        if (r2 > case2) {
            System.out.println("Awesome! Move your character forward!");
        }else {
            System.out.println("Aww! You lost the adventure!");
            return false;
        }
        //final move
        int r3 = roll(sides);
        System.out.println("3rd roll: you got a: " + r3);
        if (r3 > case3) {
            System.out.println("Congrats! You won the game!!!!!");
            return true;
        }else {
            System.out.println("Aww! You lost the adventure!");
            return false;
        }
    }

    public static int roll(int sides) {
        Random r = new Random();
        return r.nextInt(sides) + 1;
    }

}
