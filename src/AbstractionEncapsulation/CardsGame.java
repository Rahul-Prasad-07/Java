package AbstractionEncapsulation;
import java.util.*;
/*Description
Write and design a program as per the given instructions:

-Create a class ‘Cards’ and define suitable class variables for it.
-Create a class ‘ClassicGame’ and define suitable class variables for it.
-The function of the class ‘ClassicGame’ name game will take two cards as input and compare them.
-First, compare the values on the cards; the player having higher number on the card will win the game. For example, the card having the number 2 will lose to the card having the number 3.
-If the numbers on the cards are the same, compare the suits of the two cards. The suits in order of priority are:
-Spades > Diamond > Hearts > Clubs
-Increase the point of the winner card by 1 and print the scores.


Input: Your program will take the following as input from the user:
-Suit of card 1 as a string
-The number on card 1.
-Suit of card 2 as a string
-The number on card 2.*/
class Cards {
        int value;
        String suit;

        public void setCards(String suit, int r) {
            this.value = r;
            this.suit = suit;
        }

        int getValue() {
            return value;
        }

        int getSuitPriority(String suitString) {
            int suit = 0;
            //Switch statement with int data type
            switch (suitString) {
                case "clubs":
                    suit = 1;
                    break;
                case "hearts":
                    suit = 2;
                    break;
                case "diamonds":
                    suit = 3;
                    break;
                case "spades":
                    suit = 4;
                    break;
                default:
                    break;
            }

            return suit;

        }


    }

    class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public void game(Cards c1, Cards c2) {
            if (c1.getValue() < c2.getValue()) {
                points2++;
            } else if (c1.getValue() > c2.getValue()) {
                points1++;
            } else {
                if (c1.getSuitPriority(c1.suit) > c2.getSuitPriority(c2.suit)) {
                    points1++;
                } else {
                    points2++;
                }
            }

            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }

    }

    public class CardsGame{
        public static void main(String[] args) {
            //Two objects (cards) of class Cards
            Cards c1 = new Cards();
            Cards c2 = new Cards();
            Scanner in = new Scanner(System.in);
            //Enter the suit of card 1
            String s1 = in.nextLine();
            c1.setCards(s1, in.nextInt());
            in.nextLine();
            //Enter the suit of card 2
            String s2 = in.nextLine();
            c2.setCards(s2, in.nextInt());
            ClassicGame c = new ClassicGame();

            c.game(c1, c2);
        }
    }

