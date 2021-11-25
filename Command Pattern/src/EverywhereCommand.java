package src;
/**
 * EverywhereCommand is a type of Command
 * @author Brennan Cain
 */
public class EverywhereCommand implements Command{
    private MilitaryCadence cadence; // MilitaryCadence is required for the execute method

    /**
     * constructor for the EverywhereCommand 
     * @param cadence we use this to excute EverywhereCommand
     * @author Brennan Cain
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * excute method that is required for all
     * children of Command
     * uses the candence to call the write song
     * @author Brennan Cain
     */
    public void execute() {
        cadence.singEverywhereWeGo();
    }
}
