public class ContemporaryPlan extends HousePlan{
    public ContemporaryPlan(){
        super(5, 40 ,3000);
        setMaterials();
        setFeatures();
    }
    protected void setMaterials(){
        this.materials.add("Ceramics");
        this.materials.add("High-Strength Alloys");
        this.materials.add("Composties");
    }
    protected void setFeatures(){
        this.features.add("Oversized Windows");
        this.features.add("Unconvetional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor PLan");
    }
    public String toString(){
        String result = "";
        result += "------ Contemporary Home ------\n";
        result += "\n";
        result +=super.toString();
        return result;
    }
}