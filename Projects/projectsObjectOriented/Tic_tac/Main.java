import java.io.IOException;

public class Main {

        public static void main(String[] args) throws IOException {
            Board board = new Board();
            while (board.startGame()) {
                board = new Board();
            }
        }
}
