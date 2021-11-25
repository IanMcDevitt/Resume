import java.util.ArrayList;
public abstract class HousePlan{
    protected ArrayList<String> materials;
    protected ArrayList<String> features;

    private int numRooms;
    private int numWindows;
    private int squareFeet;
    

    public HousePlan(int numRooms, int numWindows, int squareFeet){
        super();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
       
    }
    protected abstract void setMaterials();
    protected abstract void setFeatures();

    public ArrayList<String> getMaterials(){
        return materials;
    }
    public ArrayList<String> getFeatures(){
        return features;
    }
    public int getNumRooms(){
        return this.numRooms;
    }
    public int getNumWindows(){
        return this.numWindows;
    }
    public int getSquareFeet(){
        return this.squareFeet;
    }
    public String toString(){
        
        String print ="";
        print += "Square Feet: " + getSquareFeet() + "\n";
        print += "Room: " + getNumRooms() + "\n";
        print += "Windows: " + getNumWindows() + "\n";
        print += "\n";
        print += "Materials:";
            for(int i =0; i<getMaterials().size(); i++){
                print += "\n"+"-" + getMaterials().get(i);
            }
        print += "\n"+"\n";
        print += "Features:";
        for(int i =0; i<getFeatures().size(); i++){
            print += "\n"+"-" + getFeatures().get(i);
        }
        print += "\n";
        return print;
    }
}