package reptes_programacio.LleiDhondtOOT;

import java.util.ArrayList;
import java.util.List;

public class CalculReglaHondt extends Elections {
    private List<Candidatura> candidatures = new ArrayList<>();
    private int numberEscons;

    public CalculReglaHondt(List<Candidatura> candidatures, int numberEscons) {
        super(candidatures, numberEscons);
    }

    public int[] correspondingEscons() {

    }
}
