import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class TriviaGame{

    private static TriviaGame triviaGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    /**
     * creates a new constructor 
     * @param rand creates new instance of random varible 
     * @param reader creates new instnace of scanner
     * @param questions loads questions from dataloader
     */
    private TriviaGame(){
        rand = new Random();
        reader = new Scanner(System.in);
        questions = DataLoader.getTriviaQuestions();
    }
    /**
     * creates a static method triviagame
     * @return a new trivia game
     */
    public static TriviaGame getInstance(){
        if(triviaGame == null) {
            System.out.println("\nCreating Game.");
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    /**
     * plays new the new game 
     */
    public void play(){
        System.out.println("Welcome to Trivia Game!"); 
        String choice = "P";
        while(choice.equalsIgnoreCase("P")){
         
            if(choice.equalsIgnoreCase("P")){
                playRound();
            }
            System.out.println("(P)lay or (Q)uit:");
            choice = reader.next();
        }
        if(choice.equalsIgnoreCase("Q")){
            System.out.print("Game is over");
            System.out.print("Your score is: " + score);
        } else {
            System.out.println("Inccorect input... starting over");
        }
    }
    /**
     * handles every new round for trivia game
     * @param choi handles user input
     * @param random gets new random number
     * @return true if correct and false if incorrect
     */
    private boolean playRound(){
        int random = rand.nextInt(questions.size());
        int choi;
        System.out.println(questions.get(random));
        choi = reader.nextInt();
        /**
         * checks if user input is correct for correspodning question
         */
          if(questions.get(random).isCorrect(choi))
          {
            System.out.println("Correct!");
            score++;
            return true;
         }
         else { 
             System.out.println("incorrect");
         }
        if(choi < 1 || choi > 4){
            System.out.println("Bad Input");
        }
            return false;
    }
}