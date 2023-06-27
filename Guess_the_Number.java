import java.util.*;
public class Guess_the_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, attempts = 0;
        int score = 0;
        System.out.println("...Enter 1 to play the game and 0 to quit the game...");
        input = sc.nextInt();
        while (true) {
            if (input == 0) {
                System.out.println("^_^ Thank You ^_^");
                break;
            } else if (input == 1) {
                attempts++;
                int usernum;
                System.out.println("***********************************");
                System.out.println("Welcome to the Number Guessing Game");
                System.out.println("***********************************");
                System.out.println("---Enter a user given number between 1 to 100---");
                usernum = sc.nextInt();
                int randnum = (int) (Math.random() * 100) + 1;
                System.out.println("Number given by user: " + usernum);
                System.out.println("Random Number generated: " + randnum);
                if (randnum == usernum) {
                    System.out.println("!!!It's a Right Guess!!!");
                    System.out.println("Your Score is: " + score);
                } else if (usernum > randnum) {
                    System.out.println("!oops!Given number is greater than generated number");
                    System.out.println("Your Score is: " + score);
                } else {
                    System.out.println("!Sorry!Given number is smaller than generated number");
                    System.out.println("Your Score is: " + score);
                }
                System.out.println("Number of attempts you made = " + attempts);
                System.out.println("...??Play Again??...");
                input = sc.nextInt();
                if (input != 1) {
                    System.out.println("###Better Luck Next Time###");
                } else
                    continue;
            } else {
                System.out.println("Wrong Input");
                break;
            }
        }
    }
}
