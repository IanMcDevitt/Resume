package src;
/**
 * IDontKnowCommand is a type of Command
 * @author Brennan Cain
 */
public class IDontKnowCommand implements Command {
    private MilitaryCadence cadence; // MilitaryCadence is required for the execute method

    /**
     * constructor for the IDontKnowCommand 
     * @param cadence we use this to execute the IDontKnowCommmand 
     * @author Brennan Cain
     */
    public IDontKnowCommand(MilitaryCadence militaryCadence) {
        this.cadence = militaryCadence;
    }
    /**
     * excute method that is required for all
     * children of Command
     * uses the candence to call the write song
     * @author Brennan Cain
     */
    public void execute() {
        cadence.singIDontKnow();
    }
}
