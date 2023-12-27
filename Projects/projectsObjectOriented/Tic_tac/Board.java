import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class Board {
    private char[] cells = new char[9]; //stan planszy
    private Scanner scanner = new Scanner(System.in);
    private AI ai = new AI(this); //Obiekt AI
    private boolean aiErrors = false; //jak true to błędy
    private boolean twoPlayers = false; //jak true to 2 graczy
    private Player player1;
    private Player player2;
    private File file; //dla pliku do zapisu

    public Board() throws IOException {
        for (int i = 0; i < 9; i++) {
            cells[i] = (char) (i + '1');  //rzutowanie z całkowitych na znaki
        }
        file = new File("game_results.txt"); //obiekt jako plik
    }

    public boolean startGame() throws IOException {
        // Wybór trybu gry
        System.out.println("Wybierz tryb gry: 1 - gracz vs AI, 2 - gracz vs gracz, 3 - gracz vs AI (AI popełnia błędy), Q - quit");
        String mode = scanner.next();
        if (mode.equalsIgnoreCase("Q")) { //czy małe czy duże q i tak wyłączy
            file.close();
            return false;
        }
        int modeInt = Integer.parseInt(mode); // Konwersja wyboru na liczbę
        System.out.println("Podaj imię gracza 1:");
        String name = scanner.next();
        player1 = new Player(name); //obiekt player1
        file.write("ID: " + player1.getId() + ", Imię: " + player1.getName() + "\n"); //info do pliku
        if (modeInt == 2) {//od dwóch graczy
            twoPlayers = true;
            System.out.println("Podaj imię gracza 2:");
            name = scanner.next();
            player2 = new Player(name); // Tworzenie gracza 2
            file.write("ID: " + player2.getId() + ", Imię: " + player2.getName() + "\n");
        } else if (modeInt == 3) {
            aiErrors = true; // zeby IA z błedami
        }
        printBoard(); //rysowanie
        System.out.println("Kto zaczyna? 1 - gracz, 2 - komputer");
        int choice = scanner.nextInt();
        if (choice == 1) {
            playerMove(); //jak gracz jest pierwszy a nie to PC
        } else {
            aiMove();
        }
        return true;
    }

    public void playerMove() throws IOException {
        System.out.println("Podaj numer pola (1-9):");
        while (true) {
            try {
                int move = scanner.nextInt() - 1; //-1 bo w tablicy od 0
                if (move >= 0 && move < 9 && cells[move] == (char) (move + '1')) {//jak dostępne
                    cells[move] = 'X'; //przesłanie gdzie ruch
                    printBoard(); // Wyświetlanie
                    if (checkWin('X')) {
                        System.out.println("\033[0;32m" + "Gracz wygrywa!" + "\033[0m");
                        file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: Komputer " + "\nWygrał Player 1\n");
                        file.close(); // Zamykanie pliku
                    } else if (isDraw()) { // Sprawdzanie czy jest remis
                        System.out.println("Remis!");
                        file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: Komputer " + "Remis\n");
                        file.close(); // jak remis to close
                    } else if (twoPlayers) { // tylko jak 2 graczy
                        secondPlayerMove();
                    } else { // z komputerem
                        aiMove();
                    }
                    break;
                } else {
                    System.out.println("To pole jest już zajęte lub nie istnieje. Spróbuj ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Wprowadź liczbę od 1 do 9.");
                scanner.next(); //zabezpieczenie jakby nie było od 1-9
            }
        }
    }

    public void secondPlayerMove() throws IOException {
        System.out.println("Drugi gracz - podaj numer pola (1-9):");
        while (true) {
            try {
                int move = scanner.nextInt() - 1; //info z ruchu 2 player
                if (move >= 0 && move < 9 && cells[move] == (char) (move + '1')) {
                    cells[move] = 'O';
                    printBoard();
                    if (checkWin('O')) {
                        System.out.println("\033[0;32m" + "Drugi gracz wygrywa!" + "\033[0m");
                        file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: " + player2.getName() + "(ID: " + player2.getId() + ") " + "\nWygrał Player 2\n");
                        file.close();
                    } else if (isDraw()) {
                        System.out.println("Remis!");
                        file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: " + player2.getName() + "(ID: " + player2.getId() + ") " + "Remis\n");
                        file.close();
                    } else {
                        playerMove();
                    }
                    break;
                } else {
                    System.out.println("To pole jest już zajęte lub nie istnieje. Spróbuj ponownie.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Wprowadź liczbę od 1 do 9.");
                scanner.next();
            }
        }
    }

    public void aiMove() throws IOException {
        int move = ai.getMove(aiErrors);
        cells[move] = 'O';
        printBoard();

        if (checkWin('O')) {
            System.out.println("\033[0;31m" + "Komputer wygrywa!" + "\033[0m");
            file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: Komputer " + "Wygrał Player 2\n");
            file.close();
        } else if (isDraw()) {
            System.out.println("Remis!");
            file.write("Player1: " + player1.getName() + "(ID: " + player1.getId() + ") " + "Player2: Komputer " + "Remis\n");
            file.close();
        } else {
            playerMove();
        }
    }

    public void printBoard() {

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            if (cells[i] == 'X') {
                System.out.print("\033[0;34m" + cells[i] + " " + "\033[0m");
            } else if (cells[i] == 'O') {
                System.out.print("\033[0;33m" + cells[i] + " " + "\033[0m");
            } else {
                System.out.print(cells[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean checkWin(char player) {
        for (int i = 0; i < 9; i += 3) {
            if (cells[i] == player && cells[i + 1] == player && cells[i + 2] == player) {
                return true; //w poziomie
            }
        }
        for (int i = 0; i < 3; i++) {
            if (cells[i] == player && cells[i + 3] == player && cells[i + 6] == player) {
                return true; //w pionie
            }
        }
        //na przekątnych
        if (cells[0] == player && cells[4] == player && cells[8] == player) {
            return true;
        }
        if (cells[2] == player && cells[4] == player && cells[6] == player) {
            return true;
        }
        return false; //brak
    }

    public boolean isDraw() {
        //czy remis
        for (int i = 0; i < 9; i++) {
            if (cells[i] == (char) (i + '1')) {
                return false; // jak cos puste to nie ma remisu
            }
        }
        return true; // tylko jak wszystko pełne
    }

    public char[] getCells() {
        return cells; //to daje tabilce z stanem planszy
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();//łańcuch z planszy
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                sb.append("\n");//dołącza do konca
            }
            if (cells[i] == 'X') {
                sb.append("\033[0;34m" + cells[i] + " " + "\033[0m");
            } else if (cells[i] == 'O') {
                sb.append("\033[0;33m" + cells[i] + " " + "\033[0m");
            } else {
                sb.append(cells[i] + " ");
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
