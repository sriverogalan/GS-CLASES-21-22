package reptesProgramacio;

import java.util.*;

public class ReglaHondt {
    /* Variables and constructor */
    private int[][] escons;
    private ArrayList<String> politicalParty;
    private ArrayList<Integer> votes;
    private ArrayList<Integer> correspondingEscons = new ArrayList<>();
    private int numberEscons = 0;

    private ArrayList<String> exclosed_politicalParty = new ArrayList<>();

    public ReglaHondt(ArrayList<String> politicalParty, ArrayList<Integer> votes, int numEscons) {
        this.politicalParty = politicalParty;
        this.votes = votes;
        this.numberEscons = numEscons;
    }

    /* Methods */

    private float totalVotes(){
        int total = 0;
        for (int vote : votes) {
            total += vote;
        }
        return total*0.03F;
    }
    private void discardPoliticalParties() {
        for (int j = 0; j < politicalParty.size(); j++) {
            if (votes.get(j) <  (float) totalVotes()) {
                exclosed_politicalParty.add(politicalParty.get(j));
                politicalParty.remove(j);
                votes.remove(j);
                j--;
            }
        }
    }
    private void dividingVotesInEscons() {
        escons = new int[politicalParty.size()][numberEscons];
        int var1 = 0;
        for (int i = 0; i < politicalParty.size(); i++) {
            var1 = 0;
            for (int j = 0; j < numberEscons; j++) {
                if (j == 0) {
                    escons[i][j] = votes.get(i);
                    var1 = 2;
                } else {
                    escons[i][j] = votes.get(i) / var1;
                    var1++;
                }
            }
        }
    }
    private void addVotes() {
        System.out.println("Vots dividits:");
        for (int i = 0; i < politicalParty.size(); i++) {
            System.out.println("- " + politicalParty.get(i) +" :");
            for (int j = 0; j < numberEscons; j++) {
                correspondingEscons.add(escons[i][j]);
                System.out.print(escons[i][j] + "|");
            }
            System.out.println();
        }
    }
    private void sortVotes() {
        Comparator<Integer> compared = Collections.reverseOrder();
        correspondingEscons.sort(compared);

        for (int i = numberEscons; i < correspondingEscons.size(); i++) {
            correspondingEscons.remove(i);
            i--;
        }
    }
    private int[] correspondingEscons() {
        int[] esconsPartits = new int[politicalParty.size()];
        int var1 = -1;
        int var2 = -1;

        for (int i = 0; i < politicalParty.size(); i++) {
            for (int j = 0; j < numberEscons; j++) {
                for (int correspondingEscon : correspondingEscons) {
                    if (i == var1 && j == var2) {
                        continue;
                    }
                    if (correspondingEscon == escons[i][j]) {
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
    private void printEsconsAvailables(){
        System.out.println("\n"+"Escons per partit: ");
        for (int i = 0; i < politicalParty.size(); i++) {
            System.out.println("El " + politicalParty.get(i) + " te " + correspondingEscons()[i] + " escons");
        }
    }
    private void printEsconsNotAvailables(){
        System.out.println("\n"+"Partits Politics Exclosos: ");
        for (String s : exclosed_politicalParty) {
            System.out.println(s);
        }
    }
    public void calculateReglaHondt() {
        discardPoliticalParties();
        dividingVotesInEscons();
        addVotes();
        sortVotes();
        correspondingEscons();

        printEsconsAvailables();
        printEsconsNotAvailables();
    }
}