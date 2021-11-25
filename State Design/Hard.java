import java.util.Random;
/**
 * created child of interface
 */
public class Hard implements State {
    /**
     * private variables
     */
    private  ArithemeticGame game;
    /**
     * constructor for hard game
     * @param game current game 
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }
    /**
     * gets a random number between 1- 100
     * @return r returns random number
     */
    public int getNum() {
        Random rand = new Random();
        int r = rand.nextInt(100);
        r += 1;
        return r;
    }/**
    gets operation to be performed "+" "-" "*" "/"
    @return s retuns string with operation
     */
    public String getOperation() {
        Random rand = new Random();
        int r = rand.nextInt(11);
        String s = "";
        if( r <= 10 && r > 7) {
            s = "-";
        } else if (r <=7 && r > 4 )  {
            s = "+";
        } else if ( r <= 4 && r > 2 ) {
            s = "*";
        } else  {
            s = "/";
        }
        return s;
    }
    /**
     * informs the user they are doing well
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }
    /**
     * go to previous state
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(new Medium(game));
        
    }
}