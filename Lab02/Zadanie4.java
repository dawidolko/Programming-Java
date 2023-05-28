    import java.util.Scanner;

    //Zadanie 4.
    //        Napisz program umożliwiający wprowadzanie 10-ciu liczb. Dla wprowadzonych liczb wykonaj
    //        odpowiednie algorytmy:
    //         oblicz sumę elementów tablicy,
    //         oblicz iloczyn elementów tablicy,
    //         wyznacz wartość średnią,
    //         wyznacz wartość minimalną,
    //         wyznacz wartość maksymalną.
    //        Wyniki działania algorytmów wyświetlaj na konsoli. Utwórz odpowiednie menu.

    public class Zadanie4 {
        public static void main(String[] args) {
            int[] liczby = new int[10];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj 10 liczb:");

            for (int i = 0; i < liczby.length; i++) {
                System.out.print("Liczba " + (i+1) + ": ");
                liczby[i] = scanner.nextInt();
            }

            System.out.println("\nCo chcesz zrobić z tymi liczbami?");
            System.out.println("1. Oblicz sumę elementów tablicy");
            System.out.println("2. Oblicz iloczyn elementów tablicy");
            System.out.println("3. Wyznacz wartość średnią");
            System.out.println("4. Wyznacz wartość minimalną");
            System.out.println("5. Wyznacz wartość maksymalną");

            System.out.print("WYBRAŁEŚ:");
            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    int suma = 0;
                    for (Integer liczba : liczby) {
                        suma += liczba;
                    }
                    System.out.println("Suma elementów tablicy: " + suma);
                    break;

                case 2:
                    int iloczyn = 1;
                    for (int liczba : liczby) {
                        iloczyn *= liczba;
                    }
                    System.out.println("Iloczyn elementów tablicy: " + iloczyn);
                    break;

                case 3:
                    double srednia = 0;
                    for (int liczba : liczby) {
                        srednia += liczba;
                    }
                    srednia /= liczby.length;
                    System.out.println("Średnia elementów tablicy: " + srednia);
                    break;

                case 4:
                    int min = Integer.MAX_VALUE;
                    for (int liczba : liczby) {
                        if (liczba < min) {
                            min = liczba;
                        }
                    }
                    System.out.println("Wartość minimalna: " + min);
                    break;

                case 5:
                    int max = Integer.MIN_VALUE;
                    for (int liczba : liczby) {
                        if (liczba > max) {
                            max = liczba;
                        }
                    }
                    System.out.println("Wartość maksymalna: " + max);
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór");
                    break;
            }
        }
    }