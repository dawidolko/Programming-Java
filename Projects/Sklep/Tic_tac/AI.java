public class AI {
    private Board board; //referencja do board

    public AI(Board board) {
        this.board = board; // Przypisanie referencji do planszy
    }

    public int getMove(boolean aiErrors) {
        char[] cells = board.getCells(); //aktualny stan planszy
        //czy moze wygrac
        for (int i = 0; i < 9; i++) {
            if (cells[i] == (char) (i + '1')) { //jak wolne
                cells[i] = 'O'; //test wykonania
                if (board.checkWin('O')) { // jakby prowadziło do wygranej to cofnie ten ruch
                    cells[i] = (char) (i + '1');
                    return i; //daje co wybrało
                }
                cells[i] = (char) (i + '1');
            }
        }
        //tu ai ma wygrywac
        if (!aiErrors) {
            for (int i = 0; i < 9; i++) {
                if (cells[i] == (char) (i + '1')) { //jak wolne to robi test
                    cells[i] = 'X'; // Symulacja
                    if (board.checkWin('X')) { // Jeśli wygrana
                        cells[i] = (char) (i + '1'); //
                        return i;
                    }
                    cells[i] = (char) (i + '1');
                }
            }
        }
        // jak nie ma wygranych ani blokujacych to pierwsze lepsze
        for (int i = 0; i < 9; i++) {
            if (cells[i] == (char) (i + '1')) {
                return i;
            }
        }
        return -1; // nie ma wolnych to sie wywoła remis
    }
}
