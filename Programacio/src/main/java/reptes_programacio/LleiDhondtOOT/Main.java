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
        List<Candidacy> canditures = new ArrayList<>();

        canditures.add(c1);
        canditures.add(c2);
        canditures.add(c3);
        canditures.add(c4);
        canditures.add(c5);

        new CalculateHondtRule(new Elections(canditures, 8));

    }
}
