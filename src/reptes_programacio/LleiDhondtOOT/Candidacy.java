package reptes_programacio.LleiDhondtOOT;

public class Candidacy extends PoliticalParties {
    /**
     * Variables
     */
    private int vots;
    private int escons = 0;
    private boolean isExclosed = false;

    public Candidacy(int vots, String name) {
        super(name);
        this.vots = vots;
        this.escons = escons;
    }

    public Candidacy(int vots, String name, boolean isExclosed) {
        super(name);
        this.vots = vots;
        this.escons = escons;
        this.isExclosed = isExclosed;
    }

    /**
     * Setters
     */
    public void setExclosed(boolean exclosed) {
        isExclosed = exclosed;
    }

    public void setVots(int vots) {
        this.vots = vots;
    }

    public void setEscons(int escons) {
        this.escons = escons;
    }

    /**
     * Getters
     */
    public boolean isExclosed() {
        return isExclosed;
    }

    public int getVots() {
        return vots;
    }

    public int getEscons() {
        return escons;
    }

}
