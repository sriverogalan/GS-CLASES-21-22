package reptesProgramacio.LleiDhondt;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> nomPartits = new ArrayList<>();
        nomPartits.add("Partit A");
        nomPartits.add("Partit B");
        nomPartits.add("Partit C");
        nomPartits.add("Partit D");
        nomPartits.add("Partit E");

        ArrayList<Integer> numeroVots = new ArrayList<>();
        numeroVots.add(120000);
        numeroVots.add(100000);
        numeroVots.add(40000);
        numeroVots.add(5000);
        numeroVots.add(2500);

        ReglaHondt reglaHondt = new ReglaHondt(nomPartits, numeroVots, 7);
        reglaHondt.calculateReglaHondt();

    }
}
