public class HousePlanFactory{
    public static HousePlan createHousePlan(String type){
        HousePlan housePlan;
        
        if(type.equalsIgnoreCase("log cabin")){
          housePlan = new LogCabinPlan();
        }
        else if(type.equalsIgnoreCase("tiny home")){
            housePlan = new TinyHomePlan();
        }
        else if(type.equalsIgnoreCase("contemporary home")){
            housePlan = new ContemporaryPlan();
        }else{
            System.out.println("hello");
             return null;
        }
        housePlan.getNumRooms();
        housePlan.getNumWindows();
        housePlan.getSquareFeet();
        housePlan.getFeatures();
        housePlan.getMaterials();
        housePlan.toString();
        return housePlan;
    }
}