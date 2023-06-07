public abstract class TV implements ChangeChannel, Change{ // klasa abstrakcyjna
    public abstract void onTV(boolean b); // metoda abstrakcyjna

    @Override
    public String toString() {
        return "Metoda toString klasy TV";
    }

    public static void ChangeVolume()
    {
        System.out.println("Zmiana glosnosci");
    }
}
