package reptes_programacio.LleiDhondtOOT;

public class Candidatura {
    /** Variables */
    private PartitPolitic partitPolitic;
    private int vots;
    private int escons;

    public Candidatura(PartitPolitic partitPolitic, int vots, int escons){
        this.partitPolitic = partitPolitic;
        this.vots = vots;
        this.escons = escons;
    }
    /** Setters */

    public void setPartitPolitic(PartitPolitic partitPolitic) {
        this.partitPolitic = partitPolitic;
    }

    public void setVots(int vots) {
        this.vots = vots;
    }

    public void setEscons(int escons) {
        this.escons = escons;
    }
    /** Getters */
    public PartitPolitic getPartitPolitic() {
        return partitPolitic;
    }

    public int getVots() {
        return vots;
    }

    public int getEscons() {
        return escons;
    }
}
