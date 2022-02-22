package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;
import java.util.List;

public class CalculReglaHondt {
    private Candidatura c1 = new Candidatura(120000, "P1");
    private Candidatura c2 = new Candidatura(100000, "P2");
    private Candidatura c3 = new Candidatura(40000, "P3");
    private Candidatura c4 = new Candidatura(5000, "P4");
    private Candidatura c5 = new Candidatura(2500, "P5");
    private List<Candidatura> candidatures = new ArrayList<>();

    public void correspondingEscons() {
        candidatures.add(c1);
        candidatures.add(c2);
        candidatures.add(c3);
        candidatures.add(c4);
        candidatures.add(c5);

        Elections elections = new Elections(candidatures, 8);

        int[][] escons = elections.dividingVotesInEscons();
        int var1 = -1;
        int var2 = -1;

        int counter = elections.getNumberEscons();

        for (int j = 0; j < elections.getNumberEscons(); j++) {
            for (int i = 0; i < escons.length; i++) {
                if (counter == 0) {
                    break;
                }
                for (int k = 0; k < escons[i].length; k++) {
                    if (i == var1 && k == var2) {
                        continue;
                    }
                    if (escons[i][j] < escons[i+1][j+1]){

                    }
                }
                counter--;
            }
        }

        System.out.println("\n" + "Escons per partit: ");
        for (int i = 0; i < candidatures.size(); i++) {
            System.out.println("El " + candidatures.get(i).getName() + " te " + candidatures.get(i).getEscons() + " escons");
        }
    }

}
