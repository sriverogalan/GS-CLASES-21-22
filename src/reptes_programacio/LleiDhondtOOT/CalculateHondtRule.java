package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculateHondtRule {

    private List<Candidacy> candidatures;
    private Elections elections;
    private int[][] escons;
    private List<Integer> numFinal = new ArrayList<>();

    public CalculateHondtRule(List<Candidacy> candidatures, Elections elections) {
        this.elections = elections;
        this.candidatures = candidatures;
        this.escons = elections.dividingVotesInEscons();

        setNumbersIntoNumFinal();
        sortNumFinal();
        assignSeats();
        printSeatsParties();
        printPartiesNotAvailables();
    }

    private void setNumbersIntoNumFinal() {
        for (int i = 0; i < escons.length; i++) {
            for (int j = 0; j < escons[i].length; j++) {
                numFinal.add(escons[i][j]);
            }
        }
    }

    private void sortNumFinal() {
        Comparator<Integer> compared = Collections.reverseOrder();
        numFinal.sort(compared);
        sortNumberSeats();
    }

    private void sortNumberSeats() {
        int counter = elections.getNumberEscons();
        for (int i = counter; i < numFinal.size(); i++) {
            numFinal.remove(i);
            i--;
        }
    }

    private void assignSeats() {
        int var1 = -1;
        int var2 = -1;
        for (int i = 0; i < escons.length; i++) {
            for (int j = 0; j < escons[i].length; j++) {
                for (int k = 0; k < numFinal.size(); k++) {
                    if (i == var1 && j == var2) {
                        continue;
                    }
                    if (escons[i][j] == numFinal.get(k)) {
                        candidatures.get(i).setEscons(candidatures.get(i).getEscons() + 1);
                        var1 = i;
                        var2 = j;
                        break;
                    }

                }
            }
        }
    }

    private void printSeatsParties() {
        System.out.println("\n" + "Escons per partit: ");
        for (int i = 0; i < candidatures.size(); i++) {
            System.out.println("El " + candidatures.get(i).getName() + " te " + candidatures.get(i).getEscons() + " escons");
        }
    }

    private void printPartiesNotAvailables() {
        System.out.println("\n" + "Escons excluides ");
        for (int i = 0; i < candidatures.size(); i++) {
            if (candidatures.get(i).isExclosed()) {
                System.out.println("El " + candidatures.get(i).getName() + " esta exclos. ");
            }
        }
    }

}
