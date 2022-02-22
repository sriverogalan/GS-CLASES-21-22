package reptes_programacio.LleiDhondtOOT;

import java.util.List;

public class Elections {
    private List<Candidatura> candidatures;
    private int numberEscons;
    private final float percentatge = 0.03F;

    public Elections(List<Candidatura> candidatures, int numberEscons) {
        this.candidatures = candidatures;
        this.numberEscons = numberEscons;
    }

    private float percentatgeExclos(){
        int total = 0;
        for (Candidatura candidature : candidatures) {
            total += candidature.getVots();
        }
        return total*percentatge;
    }

    private List<Candidatura> partitsQueSuperenElPercentatgeExclos(){
        for (int i = 0; i < candidatures.size(); i++){
            if (candidatures.get(i).getVots() < (float) percentatgeExclos()){
                candidatures.get(i).setExclosed(true);
            }
        }
        return candidatures;
    }

    public int[][] dividingVotesInEscons() {
        int var1 = 0;
        partitsQueSuperenElPercentatgeExclos();
        int[][] escons = new int[candidatures.size()][numberEscons];

        for (int k = 0 ; k < candidatures.size(); k++){
            if (!candidatures.get(k).isExclosed()){
                System.out.print(candidatures.get(k).getName() + " ");
                for (int j = 0; j < numberEscons; j++) {
                    if (j == 0) {
                        escons[k][j] = candidatures.get(k).getVots();
                        var1 = 2;
                    } else {
                        escons[k][j] = candidatures.get(k).getVots() / var1;
                        var1++;
                    }
                    System.out.print(escons[k][j] + "|");
                    candidatures.get(k).setEscons(var1);
                }
            } else {
                System.out.print(candidatures.get(k).getName() + " X ");
            }
            System.out.println();
        }
        return escons;
    }


}
