package Point;

import java.util.Scanner;

public class Run
{
    public void Runs()
    {
        inicjalizacja();
        while (true)
        {
            menu();
            int choice = inputInt();
            switch (choice)
            {
                case 1 -> infoP();
                case 2 -> wypiszP();
                case 3 -> changeP();
                case 4 -> resetP();
                case 5 -> moveP();
                case 6 -> infoF();
                case 7 -> wypiszF();
                case 8 -> changeF();
                case 9 -> changeSF();
                case 10 -> moveF();
                case 11 -> infoTr();
                case 12 -> wypiszTr();
                case 13 -> changeTr();
                case 14 -> changeSTr();
                case 15 -> moveTr();
                case 16 -> poleTr();
                case 17 -> infoPr();
                case 18 -> wypiszPr();
                case 19 -> changePr();
                case 20 -> changeSPr();
                case 21 -> movePr();
                case 22 -> polePr();
                case 23 -> infoKw();
                case 24 -> wypiszKw();
                case 25 -> changeKw();
                case 26 -> changeSKw();
                case 27 -> moveKw();
                case 28 -> poleKw();
                case 29 -> infoOk();
                case 30 -> wypiszOk();
                case 31 -> changeOk();
                case 32 -> changeSOk();
                case 33 -> moveOk();
                case 34 -> poleOk();
                case 35 -> sredOk();
                case 36 -> wSrodkuOk();
                case 37 -> end();
                default -> defaultChoice();
            }
        }
    }

    public void infoP()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz punkt? Podaj liczbę z zakresu od " + 1 + " do " + pTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > pTab.length);
        pTab[x - 1].opis();
    }

    public void wypiszP()
    {
        for(int x = 0; x < pTab.length; x++)
        {
            System.out.print("Dla punktu " + (x + 1) + ": ");
            pTab[x].opis();
        }
    }

    public void changeP()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz punkt? Podaj liczbę z zakresu od " + 1 + " do " + pTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > pTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        pTab[x - 1].setX(a);
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        pTab[x - 1].setY(b);
    }

    public void resetP()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz punkt? Podaj liczbę z zakresu od " + 1 + " do " + pTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > pTab.length);
        pTab[x - 1].zeruj();
    }

    public void moveP()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz punkt? Podaj liczbę z zakresu od " + 1 + " do " + pTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > pTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        pTab[x - 1].przesun(a,b);
    }

    public void infoF()
    {
        int x;
        do
        {
            System.out.print("Którą wybierasz figurę? Podaj liczbę z zakresu od " + 1 + " do " + fTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > fTab.length);
        fTab[x - 1].opis();
    }

    public void wypiszF()
    {
        for(int x = 0; x < fTab.length; x++)
        {
            System.out.print("Dla figury " + (x + 1) + ": ");
            fTab[x].opis();
        }
    }

    public void changeF()
    {
        int x;
        do
        {
            System.out.print("Którą wybierasz figurę? Podaj liczbę z zakresu od " + 1 + " do " + fTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > fTab.length);
        String kol;
        System.out.print("Napisz nową wartość dla koloru: ");
        kol = inputString();
        fTab[x - 1].setKolor(kol);
    }

    public void changeSF()
    {
        int x;
        do
        {
            System.out.print("Którą wybierasz figurę? Podaj liczbę z zakresu od " + 1 + " do " + fTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > fTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        fTab[x - 1].setPunkt(new Punkt(a,b));
    }

    public void moveF()
    {
        int x;
        do
        {
            System.out.print("Którą wybierasz figurę? Podaj liczbę z zakresu od " + 1 + " do " + fTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > fTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        fTab[x - 1].przesun(a,b);
    }

    public void infoTr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trTab.length);
        trTab[x - 1].opis();
    }

    public void wypiszTr()
    {
        for(int x = 0; x < trTab.length; x++)
        {
            System.out.print("Dla trójkąta " + (x + 1) + ": ");
            trTab[x].opis();
        }
    }

    public void changeTr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trTab.length);
        double a, b;
        String kol;
        System.out.print("Napisz nową wartość dla koloru: ");
        kol = inputString();
        trTab[x - 1].setKolor(kol);
        System.out.print("Napisz nową wartość dla wysokości: ");
        a = inputDouble();
        trTab[x - 1].setWys(a);
        System.out.print("Napisz nową wartość dla podstawy: ");
        b = inputDouble();
        trTab[x - 1].setPodst(b);
    }

    public void changeSTr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        trTab[x - 1].setPunkt(new Punkt(a,b));
    }

    public void moveTr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        trTab[x - 1].przesun(a,b);
    }

    public void poleTr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz trójkąt? Podaj liczbę z zakresu od " + 1 + " do " + trTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > trTab.length);
        System.out.println("Pole powierzchni trójkąta wynosi: " + trTab[x - 1].getPowierzchnia());
    }

    public void infoPr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokąt? Podaj liczbę z zakresu od " + 1 + " do " + prTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prTab.length);
        prTab[x - 1].opis();
    }

    public void wypiszPr()
    {
        for(int x = 0; x < prTab.length; x++)
        {
            System.out.print("Dla prostokąta " + (x + 1) + ": ");
            prTab[x].opis();
        }
    }

    public void changePr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokąt? Podaj liczbę z zakresu od " + 1 + " do " + prTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prTab.length);
        double a, b;
        String kol;
        System.out.print("Napisz nową wartość dla koloru: ");
        kol = inputString();
        prTab[x - 1].setKolor(kol);
        System.out.print("Napisz nową wartość dla wysokości: ");
        a = inputDouble();
        prTab[x - 1].setWys(a);
        System.out.print("Napisz nową wartość dla szerokości: ");
        b = inputDouble();
        prTab[x - 1].setSzer(b);
    }

    public void changeSPr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokąt? Podaj liczbę z zakresu od " + 1 + " do " + prTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        prTab[x - 1].setPunkt(new Punkt(a,b));
    }

    public void movePr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokąt? Podaj liczbę z zakresu od " + 1 + " do " + prTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        prTab[x - 1].przesun(a,b);
    }

    public void polePr()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz prostokąt? Podaj liczbę z zakresu od " + 1 + " do " + prTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > prTab.length);
        System.out.println("Pole powierzchni prostokąta wynosi: " + prTab[x - 1].getPowierzchnia());
    }

    public void infoKw()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwTab.length);
        kwTab[x - 1].opis();
    }

    public void wypiszKw()
    {
        for(int x = 0; x < kwTab.length; x++)
        {
            System.out.print("Dla kwadratu " + (x + 1) + ": ");
            kwTab[x].opis();
        }
    }

    public void changeKw()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwTab.length);
        double a;
        String kol;
        System.out.print("Napisz nową wartość dla koloru: ");
        kol = inputString();
        kwTab[x - 1].setKolor(kol);
        System.out.print("Napisz nową wartość dla szerokości: ");
        a = inputDouble();
        kwTab[x - 1].setSzer(a);
    }

    public void changeSKw()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        kwTab[x - 1].setPunkt(new Punkt(a,b));
    }

    public void moveKw()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        kwTab[x - 1].przesun(a,b);
    }

    public void poleKw()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz kwadrat? Podaj liczbę z zakresu od " + 1 + " do " + kwTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > kwTab.length);
        System.out.println("Pole powierzchni kwadratu wynosi: " + kwTab[x - 1].getPowierzchnia());
    }

    public void infoOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        okTab[x - 1].opis();
    }

    public void wypiszOk()
    {
        for(int x = 0; x < okTab.length; x++)
        {
            System.out.print("Dla okręgu " + (x + 1) + ": ");
            okTab[x].opis();
        }
    }

    public void changeOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        double r;
        String kol;
        System.out.print("Napisz nową wartość dla koloru: ");
        kol = inputString();
        okTab[x - 1].setKolor(kol);
        System.out.print("Napisz nową wartość dla promienia: ");
        r = inputDouble();
        okTab[x - 1].setR(r);
    }

    public void changeSOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        double a, b;
        System.out.print("Napisz nową wartość dla współrzędnej 'x': ");
        a = inputDouble();
        System.out.print("Napisz nową wartość dla współrzędnej 'y': ");
        b = inputDouble();
        okTab[x - 1].setPunkt(new Punkt(a,b));
    }

    public void moveOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        double a, b;
        System.out.print("O ile chcesz przesunąć współrzędną 'x': ");
        a = inputDouble();
        System.out.print("O ile chcesz przesunąć współrzędną 'y': ");
        b = inputDouble();
        okTab[x - 1].przesun(a,b);
    }

    public void poleOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        System.out.println("Pole powierzchni koła wynosi: " + okTab[x - 1].getPowierzchnia());
    }

    public void sredOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        System.out.println("Średnica okręgu wynosi: " + okTab[x - 1].getSrednica());
    }

    public void wSrodkuOk()
    {
        int x;
        do
        {
            System.out.print("Który wybierasz okrąg? Podaj liczbę z zakresu od " + 1 + " do " + okTab.length + ": ");
            x = inputInt();
        } while (x <= 0 || x > okTab.length);
        double a, b;
        System.out.print("Podaj współrzędną 'x' sprawdzanego punktu: ");
        a = inputDouble();
        System.out.print("Podaj współrzędną 'y' sprawdzanego punktu: ");
        b = inputDouble();
        System.out.println("Czy punkt [" + a + "," + b + "] znajduje się w środku okręgu: " + okTab[x - 1].wSrodku(new Punkt(a,b)));
    }


    Punkt[] pTab = new Punkt[5];
    Figura[] fTab = new Figura[3];
    Prostokat[] prTab = new Prostokat[5];
    Kwadrat[] kwTab = new Kwadrat[5];
    Trojkat[] trTab = new Trojkat[5];
    Okrag[] okTab = new Okrag[5];
    public void inicjalizacja()
    {
        pTab[0] = new Punkt(5, 7);
        pTab[1] = new Punkt(13.37, 21.37);
        pTab[2] = new Punkt(-6, 3.9);
        pTab[3] = new Punkt();
        pTab[4] = new Punkt();
        fTab[0] = new Figura(new Punkt(15, 12.9), "czerwony");
        fTab[1] = new Figura(new Punkt(3, 19), "niebieski");
        fTab[2] = new Figura();
        prTab[0] = new Prostokat(3, 5, "fioletowy");
        prTab[1] = new Prostokat(4.5, 7.9);
        prTab[2] = new Prostokat(1, 3, "czarny", new Punkt(3.5,2));
        prTab[3] = new Prostokat();
        prTab[4] = new Prostokat();
        kwTab[0] = new Kwadrat(6.5);
        kwTab[1] = new Kwadrat(3.4, "miedziany", new Punkt(2.4, 6.7));
        kwTab[2] = new Kwadrat(13, "mleczny");
        kwTab[3] = new Kwadrat();
        kwTab[4] = new Kwadrat();
        trTab[0] = new Trojkat(6, 8, "żółty");
        trTab[1] = new Trojkat(11, 8.2);
        trTab[2] = new Trojkat(11, 8.2, "złoty", new Punkt(-1,0));
        trTab[3] = new Trojkat(11, 8.2, "srebrny");
        trTab[4] = new Trojkat();
        okTab[0] = new Okrag(new Punkt(-3.14, 8.2), 9);
        okTab[1] = new Okrag(new Punkt(6, -3.9), 2, "pomarańczowy");
        okTab[2] = new Okrag(new Punkt(6, -1.9), 3, "cytrynowy");
        okTab[3] = new Okrag(5,"morski");
        okTab[4] = new Okrag();
    }

    public void menu()
    {
        System.out.println("\n==================================");
        System.out.println("=========   MENU OPCJI   =========");
        System.out.println("==================================");
        System.out.print("Dla punktu:\t\t");
        System.out.print("1. Wyświetl opis\t\t");
        System.out.print("2. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("3. Zmiana wartości\t\t");
        System.out.print("4. Zerowanie wartości\t\t\t");
        System.out.println("5. Przesunięcie\t\t");

        System.out.print("Dla figury:\t\t");
        System.out.print("6. Wyświetl opis\t\t");
        System.out.print("7. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("8. Zmiana wartości\t\t");
        System.out.print("9. Zmiana wartości środka\t\t");
        System.out.println("10. Przesunięcie środka\t\t");

        System.out.print("Dla trójkąta:\t");
        System.out.print("11. Wyświetl opis\t\t");
        System.out.print("12. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("13. Zmiana wartości\t\t");
        System.out.print("14. Zmiana wartości środka\t\t");
        System.out.print("15. Przesunięcie środka\t\t");
        System.out.println("16. Wyświetl pole powierzchni\t\t");

        System.out.print("Dla prostokąta:\t");
        System.out.print("17. Wyświetl opis\t\t");
        System.out.print("18. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("19. Zmiana wartości\t\t");
        System.out.print("20. Zmiana wartości środka\t\t");
        System.out.print("21. Przesunięcie środka\t\t");
        System.out.println("22. Wyświetl pole powierzchni\t\t");

        System.out.print("Dla kwadratu:\t");
        System.out.print("23. Wyświetl opis\t\t");
        System.out.print("24. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("25. Zmiana wartości\t\t");
        System.out.print("26. Zmiana wartości środka\t\t");
        System.out.print("27. Przesunięcie środka\t\t");
        System.out.println("28. Wyświetl pole powierzchni\t\t");

        System.out.print("Dla okręgu:\t\t");
        System.out.print("29. Wyświetl opis\t\t");
        System.out.print("30. Wyświetl opis wszystkich elementów\t\t");
        System.out.print("31. Zmiana wartości\t\t");
        System.out.print("32. Zmiana wartości środka\t\t");
        System.out.print("33. Przesunięcie środka\t\t");
        System.out.println("34. Wyświetl pole powierzchni\t\t");
        System.out.print("\t\t\t\t35. Wyświetl średnicę\t");
        System.out.println("36. Sprawdź czy dany punkt leży w okręgu\t\t");

        System.out.println("Pozostałe:\t\t37. Wyjście");
        System.out.println("----------------------------------");
        System.out.print("Wybierz odpowiednią operacje: ");
    }

    public void end()
    {
        System.out.print("Czy na pewno chcesz wyjść z programu? ( t | T | tak | Tak | TAK ): ");
        String znak = inputString();
        if  (znak.equals("t") || znak.equals("T") || znak.equals("tak") || znak.equals("Tak") || znak.equals("TAK"))
        {
            System.out.println("Koniec programu");
            System.exit(0);
        }
        else
        {
            System.out.println("Anulowano wyjście");
        }
    }

    public void defaultChoice()
    {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }

    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        return number;
    }

    public double inputDouble()
    {
        Scanner input = new Scanner(System.in);
        double number;
        number = input.nextDouble();
        return number;
    }

    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        return word;
    }
}
