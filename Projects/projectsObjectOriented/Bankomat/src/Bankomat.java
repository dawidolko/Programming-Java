import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Bankomat {
    public Map<String, KartaElektroniczna> akceptowaneKarty;

    public Bankomat() {
        akceptowaneKarty = new HashMap<>();
    }

    public void dodajAkceptowanaKarte(String nazwaKarty, KartaElektroniczna karta) {
        akceptowaneKarty.put(nazwaKarty, karta);
    }

    public void usunAkceptowanaKarte(String nazwaKarty) {
        akceptowaneKarty.remove(nazwaKarty);
    }


    public void wlozKarte(String nazwaKarty) {
        KartaElektroniczna karta = akceptowaneKarty.get(nazwaKarty);
        if (karta != null) {
            Scanner scanner = new Scanner(System.in);
            String podanyPin = "";

            while (!poprawnyPin(podanyPin)) {
                System.out.print("\t\t\tPodaj PIN (4 cyfry): ");
                podanyPin = scanner.nextLine();

                if (!poprawnyPin(podanyPin)) {
                    System.out.println("\t\t\tNieprawidłowy PIN. Spróbuj ponownie.");
                }
            }

            try {
                if (karta.sprawdzPin(podanyPin)) {
                    System.out.println("\t\t\tKarta zaakceptowana.");
                    if(karta instanceof KartaKredytowa){
                        System.out.println("\t\t\tKarta kredytowa (możliwość zadłużenia)");
                    }
                    pokazSaldo(karta);
                    wyplacajPieniadze(karta);
                } else {
                    throw new PinException("\t\t\tNieprawidłowy PIN.");
                }
            } catch (PinException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("\t\t\tNieobsługiwany typ karty.");
        }
    }

    private void pokazSaldo(KartaElektroniczna karta) {
        System.out.println("\t\t\tDostępne saldo: " + karta.getSaldo() + " zł");
    }

    private boolean poprawnyPin(String pin) {
        return pin.matches("\\d{4}");
    }

    private void wyplacajPieniadze(KartaElektroniczna karta) {
        Scanner scanner = new Scanner(System.in);
        double kwota = 0;
        boolean poprawnaKwota = false;
        while (!poprawnaKwota) {
            try {
                System.out.print("\t\t\tPodaj kwotę do wypłaty: ");
                kwota = scanner.nextDouble();
                scanner.nextLine();

                if (kwota< 0){
                    System.out.println("\t\t\tNiepoprawna kwota. Kwota nie może być ujemna.");
                }else{
                    poprawnaKwota = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("\t\t\tNiepoprawny format kwoty. Spróbuj ponownie.");
                scanner.nextLine();
            }
        }

        try {
            if (kwota == 0) {
                System.out.println("\t\t\tPieniądze nie zostały wypłacone. Nie zarządano żadnych środków.");
            } else if (karta.sprawdzSaldo(kwota)) {
                System.out.println("\t\t\tPieniądze wypłacone.");
            }
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }
    }
}

