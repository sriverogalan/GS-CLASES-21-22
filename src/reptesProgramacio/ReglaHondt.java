package reptesProgramacio;

import java.util.*;

public class ReglaHondt {
    private int[][] escons;

    private ArrayList<String> politicalParty;
    private ArrayList<Integer> votes;
    private ArrayList<Integer> correspondingEscons = new ArrayList<>();
    private int numeroEscons;
    
    private ArrayList<String> exclosed_politicalParty = new ArrayList<>();

    public ReglaHondt(ArrayList<String> politicalParty, ArrayList<Integer> votes, int numEscons) {
        this.politicalParty = politicalParty;
        this.votes = votes;
        this.numeroEscons = numEscons;
    }

    private double totalVotes(){
        int total = 0;
        for (int i = 0; i < votes.size(); i++) {
            total += votes.get(i);
        }
        return total* 0.03;
    }

    private void votesCalculate() {
        for (int j = 0; j < politicalParty.size(); j++) {
            if (votes.get(j) <  (double) totalVotes()) {
                exclosed_politicalParty.add(politicalParty.get(j));
                politicalParty.remove(j);
                votes.remove(j);
                j--;
            }
        }
    }

    private void dividirVotsPerTantsDeEscons() {
        escons = new int[politicalParty.size()][numeroEscons];
        int divisio = 0;
        for (int i = 0; i < politicalParty.size(); i++) {
            divisio = 0;
            for (int j = 0; j < numeroEscons; j++) {
                if (j == 0) {
                    escons[i][j] = votes.get(i);
                    divisio = 2;
                } else {
                    escons[i][j] = votes.get(i) / divisio;
                    divisio++;
                }
            }
        }
    }

    private void afegirVots() {
        for (int i = 0; i < politicalParty.size(); i++) {
            for (int j = 0; j < numeroEscons; j++) {
                correspondingEscons.add(escons[i][j]);
            }
        }
    }
    private void ordenarVots() {
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(correspondingEscons, comparador);

        for (int i = numeroEscons; i < correspondingEscons.size(); i++) {
            correspondingEscons.remove(i);
            i--;
        }
    }

    private int[] correspondingEscons() {
        int[] esconsPartits = new int[politicalParty.size()];
        int var1 = -1;
        int var2 = -1;

        for (int i = 0; i < politicalParty.size(); i++) {
            for (int j = 0; j < numeroEscons; j++) {
                for (int k = 0; k < correspondingEscons.size(); k++) {
                    if (i == var1 && j == var2) {
                        continue;
                    }
                    if (correspondingEscons.get(k) == escons[i][j]) {
                        esconsPartits[i] += 1;
                        var1 = i;
                        var2 = j;
                        break;
                    }
                }
            }
        }
        return esconsPartits;
    }

    public void calculateReglaHondt() {
        votesCalculate();
        dividirVotsPerTantsDeEscons();
        afegirVots();
        ordenarVots();
        correspondingEscons();
        System.out.println("Total de escons per partit: ");
        for (int i = 0; i < politicalParty.size(); i++) {
            System.out.println(politicalParty.get(i) + " te un total de " + correspondingEscons()[i] + " escons");
        }

        System.out.println(" ");
        System.out.println("Partits Politics Exclosos: ");
        for (int j = 0; j < exclosed_politicalParty.size(); j++){
            System.out.println(exclosed_politicalParty.get(j));
        }
    }
}