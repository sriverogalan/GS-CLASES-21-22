package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candidatura c1 = new Candidatura(120000,"P1");
        Candidatura c2 = new Candidatura(100000,"P2");
        Candidatura c3 = new Candidatura(40000,"P3");
        Candidatura c4 = new Candidatura(5000,"P4");
        Candidatura c5 = new Candidatura(2500,"P5");

        List<Candidatura> candidatures = new ArrayList<>() ;
        candidatures.add(c1);
        candidatures.add(c2);
        candidatures.add(c3);
        candidatures.add(c4);
        candidatures.add(c5);

        CalculReglaHondt calculReglaHondt = new CalculReglaHondt(candidatures,8);
        calculReglaHondt.correspondingEscons();



    }
}
