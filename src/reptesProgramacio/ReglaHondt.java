package reptesProgramacio;

import java.util.ArrayList;

public class ReglaHondt {

    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<Integer> numberVotes = new ArrayList<Integer>();

    // CONSTRUCTOR
    public ReglaHondt (ArrayList<String> name, ArrayList<Integer> numberVotes){
        this.name = name;
        this.numberVotes = numberVotes;
    }
    // SET
    public static void setName(ArrayList<String> name) {
        ReglaHondt.name = name;
    }

    public static void setNumberVotes(ArrayList<Integer> numberVotes) {
        ReglaHondt.numberVotes = numberVotes;
    }
    // GET
    public static ArrayList<Integer> getNumberVotes() {
        return numberVotes;
    }

    public static ArrayList<String> getName() {
        return name;
    }
    // METODES


}
