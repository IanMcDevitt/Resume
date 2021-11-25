package src;
import java.util.ArrayList;
/**
 * This class handles the input from the user
 * @author Stella Garcia
 */
public class InputHandler {
    private ArrayList<Command> commands; // the different types of commands will be stored her

    /**
     * Constructor for InputHandler 
     * initialzied the ArrayList with the indeces
     *  specified in the assignment description
     * @param cadence how to execute each command is in the MilitaryCadence class
     * @author Stella Garcia
     */
    public InputHandler(MilitaryCadence cadence) {
        commands = new ArrayList<Command>();
        commands.add(new IDontKnowCommand(cadence));
        commands.add(new InArmyCommand(cadence));
        commands.add(new EverywhereCommand(cadence));
    }

    /**
     * playCandence calls the correct Command's execute method
     * @param num the index number of the commands ArrayList that we want to play
     * @return boolean true if it is run, false otherwise
     * @author Stella Garcia 
     */
    public boolean playCadence(int num) {
        if(num <= commands.size()) {
            commands.get(num).execute();
            return true;
        }
        return false;
    }

}
