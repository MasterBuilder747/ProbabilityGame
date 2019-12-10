package Main;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many sides does the die have?");
        int sides = 0;
        sides = s.nextInt();
        boolean loop = true;

        while(loop) {
            try {
                if (sides == 0 || sides == 1) {
                    System.out.println("Cannot be 0 or 1.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
            Dice d = new Dice(sides);
            System.out.println("You got a " + d.rollN() + ".");

            System.out.println("Roll again? (1 = yes, 0 = no)");
            int choice = 0;
            try {
                choice = s.nextInt();
                if (choice == 0) {
                    loop = false;
                }else if (choice == 1) {
                    loop = true;
                }else {
                    System.out.println("Either 0 or 1 is valid input.");
                }
            }catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

    }

}
