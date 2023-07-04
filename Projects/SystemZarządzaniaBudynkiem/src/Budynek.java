public class Budynek {
    private String rodzajBudynku;
    private boolean czyZamkniety;
    private boolean czyWlaczaneSwiatla;

    public Budynek(String rodzajBudynku) {
        this.rodzajBudynku = rodzajBudynku;
        this.czyZamkniety = true;
        this.czyWlaczaneSwiatla = false;
    }

    public void zamknijBudynek() {
        this.czyZamkniety = true;
    }

    public void otworzBudynek() {
        this.czyZamkniety = false;
    }

    public void wlaczSwiatla() {
        this.czyWlaczaneSwiatla = true;
    }

    public void wylaczSwiatla() {
        this.czyWlaczaneSwiatla = false;
    }

    // gettery i settery

    public String getRodzajBudynku() {
        return rodzajBudynku;
    }

    public void setRodzajBudynku(String rodzajBudynku) {
        this.rodzajBudynku = rodzajBudynku;
    }

    public boolean isCzyZamkniety() {
        return czyZamkniety;
    }

    public void setCzyZamkniety(boolean czyZamkniety) {
        this.czyZamkniety = czyZamkniety;
    }

    public boolean isCzyWlaczaneSwiatla() {
        return czyWlaczaneSwiatla;
    }

    public void setCzyWlaczaneSwiatla(boolean czyWlaczaneSwiatla) {
        this.czyWlaczaneSwiatla = czyWlaczaneSwiatla;
    }
}
