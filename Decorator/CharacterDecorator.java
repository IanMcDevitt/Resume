/**
 * Written by Ian McDevitt
 */

public abstract class CharacterDecorator extends Character{
   /**
    * creates protected charcter instance
    */
   protected Character character;
/**
 * @param character intialized 
 * @param sections intialized
 * passes potato body
 * calls the customize function
 * 
 */
   public CharacterDecorator(Character character){
      super();
      this.character = character;  
      this.sections = character.sections;
      customize();
       
    }
    /**
     * abstract customize forces the children to use method
     */
   public abstract void customize();
}