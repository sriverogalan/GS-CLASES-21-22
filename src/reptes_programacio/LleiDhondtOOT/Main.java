package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Candidacy c1 = new Candidacy(120000, "P1");
        Candidacy c2 = new Candidacy(100000, "P2");
        Candidacy c3 = new Candidacy(40000, "P3");
        Candidacy c4 = new Candidacy(5000, "P4");
        Candidacy c5 = new Candidacy(2500, "P5");
        List<Candidacy> candidatures = new ArrayList<>();

        candidatures.add(c1);
        candidatures.add(c2);
        candidatures.add(c3);
        candidatures.add(c4);
        candidatures.add(c5);

        Elections elections = new Elections(candidatures, 8);

        new CalculateHondtRule(candidatures, elections);

    }
}
