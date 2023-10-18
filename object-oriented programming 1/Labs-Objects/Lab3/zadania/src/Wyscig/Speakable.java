package Wyscig;

public interface Speakable
{
    int QUIET = 0; // Domyślnie public static final - publiczne stałe statyczne
    int LOUD = 1; // Domyślnie public static final - publiczne stałe statyczne
    String getVoice(int voice); // Metoda abstrakcyjna
}
