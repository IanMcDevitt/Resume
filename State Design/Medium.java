import java.util.Random;
/**
 * created a child of interface: Medium
 */
public class Medium implements State {
    /**
     * private variable
     */
    private  ArithemeticGame game;
    /**
     * constructor for medium game
     * @param game current game
     */
    public Medium(ArithemeticGame game) {
        this.game =  game;
    }
    /**
     * get random number 1-50
     * @return r random number
     */
    public int getNum() {
        Random rand = new Random();
        int r = rand.nextInt(50);
        r += 1;
        return r;
    }/**
    get random operation "+" "-" "*"
    @return s returns random string operation
     */
    public String getOperation() {
        Random rand = new Random();
        int r = rand.nextInt(11);
        String s = "";
        if( r <= 10 && r > 7) {
            s = "-";
        } else if (r <=7 && r > 4 )  {
            s = "*";
        } else  {
            s = "+";
        }
        return s;
    }
    /**
     * goes to next state
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(new Hard(game));
    }
    /**
     * goes to previous state
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(new Easy(game));
    }
}