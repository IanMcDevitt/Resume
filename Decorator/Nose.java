/**
 * Written by Ian McDevitt
 */
import java.util.ArrayList;
public class Nose extends CharacterDecorator{
    /**
      * charcter used to pass the
       ArrayList<String> to the children of Character
       customize passed 
      * @param character
      */
    public Nose(Character character){
        super(character);
        customize();
    }
    /**
     * add mouth to potato
     * @param section
     */
    public void customize(){
        character.sections.set(4, " |   >    | ");
    }
    
}