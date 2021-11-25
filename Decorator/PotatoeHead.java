/**
 * Written by Ian McDevitt
 */
public class PotatoeHead extends Character{
 /**
  * constructs new potato body
  */
    public PotatoeHead(){
        this.sections.add("");
        this.sections.add("");
        this.sections.add(2, " /      \"" );
        this.sections.add(3, "|         | ");
        this.sections.add(4, "|        |");
        this.sections.add(5, " \\      /");
        this.sections.add(6, "  \\____/");
      
        
    }
}