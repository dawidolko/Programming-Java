public class DostepDoBudynku {
    private String kodDostepu;
    private boolean czyWolnoWejsc;

    public DostepDoBudynku(String kodDostepu) {
        this.kodDostepu = kodDostepu;
        this.czyWolnoWejsc = false;
    }

    public boolean zweryfikujDostep(String kod) {
        if (kod.equals(this.kodDostepu)) {
            this.czyWolnoWejsc = true;
            return true;
        } else {
            this.czyWolnoWejsc = false;
            return false;
        }
    }
}
