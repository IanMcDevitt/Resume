/**
 * Written by Ian McDevitt
 */

import java.util.ArrayList;
/**
 * creates abstract class
 */
public abstract class Character {
    /**
     * makes a portected ArrayList<String> varible secton
     */
    protected ArrayList<String> sections;
/**
 * constructor Character
 * @param sections intializes new ArrayList
 */
    public Character(){
       sections = new ArrayList<String>();
    }
    /**
     * creates method to output a potatoe
     */
    public void draw(){
        for(int i = 0; i < sections.size(); i++){
            System.out.println(sections.get(i));
        }
    
    
    }
    
}