package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
// Trey and Ian's part
/**Author Ian McDevitt
 * constructor for Military Cadence
 */
public class MilitaryCadence {
    public MilitaryCadence() {

    }
    /**
     * makes new array list handles file name for song "sing I Dont Know"
     * @param IDontKnow is a new array list that holds the song
     */
    public void singIDontKnow() {
        List<String> IDontKnow = fileReader("idontknow.txt");
        // helper function for sing
        sing(IDontKnow);
    }
    /**
     * makes new array list handles file name for song "sing every where we go"
     * @param everyWhereWeGo is a new array list that holds the song
     */
    public void singEverywhereWeGo() {
        List<String> everywhereWeGo = fileReader("everywhere.txt");
        // helper function for sing
        sing(everywhereWeGo);
    }
    /**
     * makes new array list handles file name for song "sing in Army"
     * @param InArmy is a new array list that holds the song
     */
    public void singInArmy() {
        List<String> InArmy = fileReader("inarmy.txt");
        // helper function for sing
        sing(InArmy);
    }
/**Author Ian McDevitt created sing helper method
 * @param song handles the song given and displays throught the arraylist by a controlled speed
 */
    public void sing(List<String> song) {
        Iterator<String> port = song.iterator();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(port.next());
        while(port.hasNext()) {
            try {
                TimeUnit.MILLISECONDS.sleep(100); // We realize that this is fast, but we left it as directed in the assignment -Ian
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(port.next());
        }
    }
    /** 
     * @author Trey Sturman
     * reads a file from the specified location and returns it as a string
     * @return file as a string
     */ 
    private List<String> fileReader(String fileName) {
        Scanner fileScanner;
        try {
            fileScanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            return null;
        }
        ArrayList<String> fileLines = new ArrayList<String>();
        while (fileScanner.hasNextLine()) {
            fileLines.add(fileScanner.nextLine());
        }
        return fileLines;
    }
}
