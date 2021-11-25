/**
 * Written by Ian McDevitt
 */
public class Hat extends CharacterDecorator{
 /**
      * charcter used to pass the
       ArrayList<String> to the children of Character
       customize passed 
      * @param character
      */
    public Hat(Character character){
         super(character);
         customize();
    }
    /**
     * add hat to potato
     * @param section
     */
    public void customize(){
        character.sections.set(0, "    ____" );
        character.sections.set(1, " __|____|____");
    }

}