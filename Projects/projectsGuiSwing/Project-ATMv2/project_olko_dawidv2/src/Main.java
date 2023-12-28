import java.util.ArrayList;

public class Main {
    public static String karta;
    public static String PIN;

    public static String[][] kody = {
            {"Visa", "5412"},
            {"American Express", "1609"},
            {"Visa Electron", "1209"},
            {"MasterCard", "9807"},
            {"Diners Club", "4510"},
            {"Japan Credit Bureau", "3399"}
    };

    public static double[] stanyKonta = {15125.43, 9871.12, 87159.38, 100562.91, 1265.07};

    public static String[] kolumnyHistoriiTransakcji = {"Numer", "Karta", "Rodzaj transakcji", "Kwota", "Data"};

    public static ArrayList<String[]> wierszeHistoriiTransakcji = new ArrayList<>();
    public static int licznikTransakcji = 1;

    public static void main(String[] args) {
        Dashboard.main();
    }
}
