/**
 * created by Ian McDevitt
 * @author Ian McDevitt
 */
import java.util.*;
import java.math.*;
import java.text.*;

public class ArithemeticGame {
    /**
     * priavte variables
     */
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;
    /**
     * Constructor for the object ArtihemeticGame
     * @param score keeps the score for the current game
     * @param easyState is the easy version of the game that is set to the Easy() constructor
     * @param hardState is the hard version of the game that is set to the Hard() constructor 
     * @param mediumState is the medium version of the game that is set to the Medium() constructor
     * @param reader scanner for the game
     */
    public ArithemeticGame() {
        this.score = score;
        easyState =  new Easy(this);
        hardState = new Hard(this);
        mediumState = new Medium(this);
        
        this.reader = new Scanner(System.in);
        if (score == 0) {
            this.state =  easyState;
        } else {
            this.state = state;
        }
       
    }/**
    runs the game and 
     */
    public void pressQuestionButton() {
       
        String op = "";
        int first;
        int second;
        double answer = 0;
        double choice;
        BigDecimal bd;
        
        op = state.getOperation();
        first = state.getNum();
        second = state.getNum();
       
        if(op.equals("+")){
            System.out.println(first + " " + op + " " + second + " to two decimal places, can round up");
            answer = first + second;
        } else if(op.equals("-")) {
            System.out.println(first + " " + op + " " + second + " to two decimal places, can round up");
            answer = first - second;
        } else if(op.equals("*")) {
            System.out.println(first + " " + op + " " + second + " to two decimal places, can round up");
            answer = first * second;
        } else if(op.equals("/")) {
            if (first <= second) {
                System.out.println(second + " " + op + " " + first + " to two decimal places, can round up");
            
                answer = second / first;
            } else {
                System.out.println(second + " " + op + " " + first + " to two decimal places, can round up");
            
                answer = first / second;
            }
            
        }
        choice = reader.nextDouble();
        
       
        if (choice == answer ) {
            System.out.println("Correct!");
            score++;
            if(score >= 3 ) {
                state.levelUp();

              
                score = 0;
            }
        } else {
            System.out.println("Incorrect!");
            score--;
            if(score <= -3) {
                state.levelDown();
                score = 0;
            }
        }

    }
    /**
     * sets the state
     * @param state current state of the game
     */
    public void setState(State state) {
            this.state = state;
    }
    /**
     * returns the state medium
     * @return mediumState
     */
    public State getMediumState() {
        return mediumState;
    }
    /**
     * returns the state east
     * @return easyState
     */
    public State getEasyState() {
        return easyState;
    }
    /**
     * returns the state hard
     * @return hardState
     */
    public State getHardState() {
        return hardState;
    }
}
