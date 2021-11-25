/**
 * Written by Ian McDevitt
 */
import java.util.ArrayList;

public class Eyes extends CharacterDecorator{
     /**
      * charcter used to pass the
       ArrayList<String> to the children of Character
       customize passed 
      * @param character
      */
    public Eyes(Character character){
        super(character);
        customize();
    }
    /**
     * add eyes to potato
     * @param section
     */
   public void customize(){
        this.sections.set(2," /  o  o |" );
   
   }
   
}