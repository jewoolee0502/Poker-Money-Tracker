import java.util.*;
import java.lang.*;

public class PokerGameMoneyTracker {
    private static String playerName1;
    private static String playerName2;
    private static String playerName3;
    private static int player1Money;
    private static int player2Money;
    private static int player3Money;
    private static int startMoney;
    private static int highestBet;
    private static int tempBet = 0;
    private static int roundMoney;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        gameSetUp(input);
        pokerGame(input);
    }

    public static void gameSetUp(Scanner input) {
        System.out.println("Enter the player names: ");
        System.out.print("> Player 1: ");
        playerName1 = input.nextLine();
        System.out.print("> Player 2: ");
        playerName2 = input.nextLine();
        System.out.print("> Player 3: ");
        playerName3 = input.nextLine();

        if(playerName1 == null || playerName2 == null || playerName3 == null) {
            System.out.println("One of the player's name has not been entered.");
            System.exit(0);
        }

        System.out.print("Enter the initial amount of money that each player will have: ");
        startMoney = input.nextInt();
        player1Money = startMoney;
        player2Money = startMoney;
        player3Money = startMoney;
        System.out.println("---------------------------------------------------------------------------------");
    }

    public static void pokerGame(Scanner input) {
        for(int i = 0; i < 50; i++) {
            rounds(input);
        }
    }

    public static void rounds(Scanner input) {

        for(int i = 0; i < 5; i++) {
            if(player1Money == 0) {
                System.out.println(playerName1 + ": All in");
            }
            if(player2Money == 0) {
                System.out.println(playerName2 + ": All in");
            }
            if(player3Money == 0) {
                System.out.println(playerName3 + ": All in");
            }

            System.out.print("What is the highest bet? ");
            highestBet = input.nextInt();
            tempBet += highestBet;
            player1Money -= highestBet;
            player2Money -= highestBet;
            player3Money -= highestBet;
            System.out.println("> " + playerName1 + ": " + player1Money);
            System.out.println("> " + playerName2 + ": " + player2Money);
            System.out.println("> " + playerName3 + ": " + player3Money);
        }
        roundMoney = (3 * tempBet);
        System.out.println("The total money that is on the table from this round is: " + roundMoney);
        System.out.println("Enter the amount of money that each player has earned. ");
        System.out.print("> " + playerName1 + ": ");
        int tempMoney1 = input.nextInt();
        System.out.print("> " + playerName2 + ": ");
        int tempMoney2 = input.nextInt();
        System.out.print("> " + playerName3 + ": ");
        int tempMoney3 = input.nextInt();

        System.out.println("Subtotal of each player's money: ");
        player1Money += tempMoney1;
        player2Money += tempMoney2;
        player3Money += tempMoney3;
        System.out.println("> " + playerName1 + ": " + player1Money);
        System.out.println("> " + playerName2 + ": " + player2Money);
        System.out.println("> " + playerName3 + ": " + player3Money);

        if(player1Money == 0) {
            System.out.println(playerName1 + " has lost.");
            System.exit(0);
        }
        if(player2Money == 0) {
            System.out.println(playerName2 + " has lost.");
            System.exit(0);
        }
        if(player3Money == 0) {
            System.out.println(playerName3 + " has lost.");
            System.exit(0);
        }
    }

//    public static void bet(Scanner input) {
//        System.out.println("What is the highest bet? ");
//        highestBet = input.nextInt();
//    }
//
//    public static void play(Scanner input) {
//        int player1Money = startMoney;
//        int player2Money = startMoney;
//        int player3Money = startMoney;
//
//        for(int i = 0; i < 50; i++) {
//            if(player1Money == 0) {
//                System.out.println(playerName1 + " has lost.");
//                System.exit(0);
//            }
//            if(player2Money == 0) {
//                System.out.println(playerName2 + " has lost.");
//                System.exit(0);
//            }
//            if(player3Money == 0) {
//                System.out.println(playerName3 + " has lost.");
//                System.exit(0);
//            }
//
//            highestBet = input.nextInt();
//
//        }
//    }

}
