package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;

public class Eleccions {
    private ArrayList<Candidatura> candidatures = new ArrayList<>();
    private int numberEscons;

    public Eleccions (ArrayList<Candidatura> candidatures,int numberEscons) {
        this.candidatures = candidatures;
        this.numberEscons = numberEscons;
    }

    private float percentatgeExclos(){
        int total = 0;
        for (Candidatura candidature : candidatures) {
            total += candidature.getVots();
        }
        return total*0.03F;
    }

    private ArrayList<Candidatura> partitsQueSuperenElPercentatgeExclos(){
        for (int i = 0; i < candidatures.size(); i++){
            if (candidatures.get(i).getVots() < (float) percentatgeExclos()){
                candidatures.remove(i);
            }
        }
        return candidatures;
    }






}
