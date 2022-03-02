package reptes_programacio.LleiDhondtOOT;

public class Candidacy extends PoliticalParty {
    /**
     * Variables
     */
    private int votes;
    private int seats = 0;
    private boolean isExclosed = false;

    public Candidacy(int vots, String name) {
        super(name);
        this.votes = vots;
    }

    /**
     * Setters
     */
    public void setExclosed(boolean exclosed) {
        isExclosed = exclosed;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * Getters
     */
    public boolean isExclosed() {
        return isExclosed;
    }

    public int getVotes() {
        return votes;
    }

    public int getSeats() {
        return seats;
    }

}
