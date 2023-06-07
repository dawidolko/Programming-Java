package task5;

public class Firma {

    //pole klasy
    private Pracownik[] pracownicy;

    //Konstruktor
    public Firma() {
        pracownicy = new Pracownik[100];
    }

    //metoda dodawania nowych pracowników do firmy
    public void addPracownik(Pracownik pracownik) {
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] == null) {
                pracownicy[i] = pracownik;
                break;
            }
        }
    }

    //metoda wypisywania aktualnego spisu pracowników
    public void showPracownicy() {
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] != null) {
                pracownicy[i].show();
            }
        }
    }
}