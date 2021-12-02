import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
public class MedicalRecordAdapter implements MedicalRecord {
    /**
     * @record a private instance of the HealthRecord class
     */
    private HealthRecord record;
/**
 * creating a constructor for the MediacalAdapter class
 * @param record takes in patients record
 */
    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }
    /**
     * gets first name of patient and returns it
     * @ret returns string containing patients first name
     */
    public String getFirstName() {
        String ret = "";
        String[] str = new String[10];
        ret = record.getName();
        str = ret.split(" ");
        ret = str[0];
        return ret;
    }
    /**
     * gets last name of patient and returns it
     * @ret returns string containing patients last name
     */
    public String getLastName() {
        String ret = "";
        String[] str = new String[10];
        ret = record.getName();
        str = ret.split(" ");
        ret = str[1];
        return ret;
    }
    /**
     * Returns birthdate
     */
    public Date getBirthday() {
        Date dt;
        String string;
        dt = record.getBirthdate();
        
        return dt;
    }
    /**
     * checks and returns gender in a number
     */
    public Gender getGender() {
        String gender;
        
        gender = record.getGender();
        if (gender.equalsIgnoreCase("male")) {
            return Gender.MALE;
        } else if (gender.equalsIgnoreCase("female")) {
            return Gender.FEMALE;
        } else {
           return Gender.OTHER;
        }
    }
    /**
     * creates a new visit 
     * @date the date of the visit
     * @well if the patient is well described as a boolean
     * @description a comment of how the visit went
     */
    public  void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
    }
    /**
     * returns a a visit history and is returned as a ListArray of Visits
     * @visit holds the patients visits
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> list;
        ArrayList<Visit> visit = new ArrayList<Visit>();
        boolean well;
        Date date = new Date();
        String string;
        String hold;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");
        String description = "";
        String[] str2;
        list = record.getHistory();
        for (String i : list) {      
                String[] str = i.split("[\\r\\n]+");
                hold = str[1];
                str2 = hold.split(" ");
                string = str2[2];
                if(str2[2].equalsIgnoreCase("true")) {
                    well = true;
                } else {
                    well = false;
                }
                str2 = str[2].split(":");
                description = str2[1];
                str2 = str[0].split(":");
                string = str2[1];
                try {
                    date = new SimpleDateFormat(" E dd, MM, yyyy").parse(string);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Visit v = new Visit(date, well, description);
                visit.add(v); 
        }
        return visit;
    }
    /**
     * Returns a string with the output of the patients information
     * @results is returned
     */
    public String toString() {
        ArrayList<Visit> visits;
        String string;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        string = simpleDateFormat.format(getBirthday());
        result += "Birthday: " + string + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";
    visits = getVisitHistory();
        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString() + "\n";
            }
        }

        return result;
        
    }
}