package src;
/**
 * interface for Commands
 * @author Trey Sturman
 */
public interface Command {
    /**
     * All children of Command will have to 
     * implement this execute method
     * Implementations will vary
     * @author Trey Sturman
     */
    public void execute();
}
