package reptes_programacio.LleiDhondtOOT;

import java.util.List;

public class Elections {
    private List<Candidacy> candidatures;
    private int numberEscons;
    private float percentatge = 0.03F;
    private float votesMin = percentatgeVotes();

    public Elections(List<Candidacy> candidatures, int numberEscons) {
        this.candidatures = candidatures;
        this.numberEscons = numberEscons;
        partiesExceedPercentageTotal();
    }

    public Elections(List<Candidacy> candidatures, int numberEscons, float percentatge) {
        this.candidatures = candidatures;
        this.numberEscons = numberEscons;
        this.percentatge = percentatge;
        partiesExceedPercentageTotal();
    }

    private float percentatgeVotes() {
        int total = 0;
        for (Candidacy candidature : candidatures) {
            total += candidature.getVotes();
        }
        return total * percentatge;
    }

    private List<Candidacy> partiesExceedPercentageTotal() {
        for (int i = 0; i < candidatures.size(); i++) {
            if (candidatures.get(i).getVotes() < (float) votesMin) {
                candidatures.get(i).setExclosed(true);
            }
        }
        return candidatures;
    }

    public int[][] dividingVotesInEscons() {
        int var1 = 0;
        int[][] escons = new int[candidatures.size()][numberEscons];

        System.out.println("Taula de relació de quocients");
        for (int k = 0; k < candidatures.size(); k++) {
            if (!candidatures.get(k).isExclosed()) {
                System.out.print(candidatures.get(k).getName() + " ");
                for (int j = 0; j < numberEscons; j++) {
                    if (j == 0) {
                        escons[k][j] = candidatures.get(k).getVotes();
                        var1 = 2;
                    } else {
                        escons[k][j] = candidatures.get(k).getVotes() / var1;
                        var1++;
                     }
                    System.out.print(escons[k][j] + " | ");
                }
                System.out.println();
            }
        }
        return escons;
    }


    /**
     * Get num total escons
     */
    public int getNumberEscons() {
        return numberEscons;
    }

    public List<Candidacy> getCandidatures() {
        return candidatures;
    }

    public void setPercentatge(float percentatge) {
        this.percentatge = percentatge;
    }
}
