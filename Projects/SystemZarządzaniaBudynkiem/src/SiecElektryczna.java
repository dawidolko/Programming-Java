public class SiecElektryczna {
    private boolean czyWlaczanaSiec;

    public SiecElektryczna() {
        this.czyWlaczanaSiec = false;
    }

    public void wlaczSiec() {
        czyWlaczanaSiec = true;
    }

    public void wylaczSiec() {
        czyWlaczanaSiec = false;
    }

    // gettery i settery

    public boolean isCzyWlaczanaSiec() {
        return czyWlaczanaSiec;
    }

    public void setCzyWlaczanaSiec(boolean czyWlaczanaSiec) {
        this.czyWlaczanaSiec = czyWlaczanaSiec;
    }
}
