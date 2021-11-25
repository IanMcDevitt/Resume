import java.util.Random;
/**
 * created a child of interface Easy
 */
public class Easy implements State{
    /**
     * private variable
     */
    private  ArithemeticGame game;
/**
 * constructor for Easy
 * @param game current game 
 */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }
    /**
     * @return r returns a random int between 1 -10
     */
    public int getNum() {
        Random rand = new Random();
        int r = rand.nextInt(10);
        r += 1;
        return r;
    }
    /**
     * gets an operation to be perfomred either "+" or "-"
     * @return s returns strin with operation
     */
    public String getOperation() {

        Random rand = new Random();
        int r = rand.nextInt(11);
        String s = "";
        if( r < 6) {
            s = "-";
        } else  {
            s = "+";
        }
        return s;
    }
    /**
     * goes to the next state
     */
    public void levelUp() {

       System.out.println("You've been advanced to medium mode.");
        game.setState(new Medium(game));
      //game.setState( new Medium(game));
    }
    /**
     * informs the user how bad they are doing
     */
    public void levelDown() {

        System.out.println("You seem to be struggling, you may want to study.");
        
    }
}