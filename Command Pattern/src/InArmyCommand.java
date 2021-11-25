package src;

/**
 * InArmyCommand is a type of Command
 * @author Brennan Cain
 */
public class InArmyCommand implements Command {
    private MilitaryCadence cadence; // MilitaryCadence is required for the execute method

    /**
     * constructor for the InArmyCommand 
     * @param cadence we use this to execute the InArmyCommmand 
     * @author Brennan Cain
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * excute method that is required for all
     * children of Command
     * uses the candence to call the write song
     * @author Brennan Cain
     */
    public void execute() {
        cadence.singInArmy();
    }
}
