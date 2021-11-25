/**
 * Written by Ian McDevitt
 */
public class Mouth extends CharacterDecorator {
/**
      * charcter used to pass the
       ArrayList<String> to the children of Character
       customize passed 
      * @param character
      */
    public Mouth(Character character){
        super(character);
        customize();
    }
    /**
     * add mouth to potato
     * @param section
     */
    public void customize(){
       character.sections.set(5, "  \\ ---- / ");
    }
}