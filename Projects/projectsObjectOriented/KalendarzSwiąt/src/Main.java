import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data pierwszaData = null;
        Data drugaData = null;

        System.out.println("Podaj rok pierwszej daty: ");
        int rok1 = scanner.nextInt();
        System.out.println("Podaj miesiąc pierwszej daty: ");
        int miesiac1 = scanner.nextInt();
        System.out.println("Podaj dzień pierwszej daty: ");
        int dzien1 = scanner.nextInt();
        pierwszaData = new Data(rok1, miesiac1, dzien1);

        while (true) {
            System.out.println("Wybierz operację:");
            System.out.println("1. Przesunięcie daty o zadaną liczbę dni i miesięcy");
            System.out.println("2. Obliczenie różnicy między dwiema datami w dniach");
            System.out.println("3. Data w innym formacie");
            System.out.println("4. Czy data jest świętem");
            System.out.println("5. Zakończenie programu");
            int wyborOperacji = scanner.nextInt();

            switch (wyborOperacji) {
                case 1:
                    System.out.print("Podaj liczbę dni do przesunięcia: ");
                    int liczbaDni = scanner.nextInt();
                    System.out.print("Podaj liczbę miesięcy do przesunięcia: ");
                    int liczbaMiesiecy = scanner.nextInt();
                    PrzesuniecieDaty przesuniecieDaty = new PrzesuniecieDaty(pierwszaData);
                    przesuniecieDaty.przesunDate(liczbaDni, liczbaMiesiecy);
                    break;
                case 2:
                    System.out.println("Podaj rok drugiej daty: ");
                    int rok2 = scanner.nextInt();
                    System.out.println("Podaj miesiąc drugiej daty: ");
                    int miesiac2 = scanner.nextInt();
                    System.out.println("Podaj dzień drugiej daty: ");
                    int dzien2 = scanner.nextInt();
                    drugaData = new Data(rok2, miesiac2, dzien2);
                    RóżnicaDat różnicaDat = new RóżnicaDat(pierwszaData, drugaData);
                    różnicaDat.obliczRóżnicęWDniach();
                    break;
                case 3:
                    FormatowanieDaty formatowanieDaty = new FormatowanieDaty(pierwszaData, drugaData);
                    formatowanieDaty.sformatujDaty();
                    break;
                case 4:
                    SprawdzenieCzySwieto sprawdzenieCzySwieto = new SprawdzenieCzySwieto(pierwszaData, drugaData);
                    sprawdzenieCzySwieto.sprawdzCzySwieto();
                    break;
                case 5:
                    System.out.println("Zakończono program.");
                    return;
                default:
                    System.out.println("Nieprawidłowy wybór operacji.");
                    break;
            }

            System.out.println();
        }
    }
}
