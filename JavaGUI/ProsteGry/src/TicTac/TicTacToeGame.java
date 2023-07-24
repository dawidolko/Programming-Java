import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeGame extends JFrame {
    private char currentPlayer;
    private char[][] board;
    private int playerXScore;
    private int playerOScore;

    public TicTacToeGame() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        board = new char[3][3];
        currentPlayer = 'X';

        initializeBoard();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = e.getY() / 100;
                int col = e.getX() / 100;

                if (board[row][col] == '\u0000') {
                    board[row][col] = currentPlayer;
                    repaint();

                    if (checkWinner(currentPlayer)) {
                        JOptionPane.showMessageDialog(TicTacToeGame.this, currentPlayer + " wins!");
                        updateScore(currentPlayer);
                        resetBoard();
                    } else if (isBoardFull()) {
                        JOptionPane.showMessageDialog(TicTacToeGame.this, "It's a draw!");
                        resetBoard();
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                }
            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    resetBoard();
                    currentPlayer = 'X';
                    repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        setFocusable(true);
        requestFocus();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '\u0000';
            }
        }
    }

    private boolean checkWinner(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        initializeBoard();
        repaint();
    }

    private void updateScore(char player) {
        if (player == 'X') {
            playerXScore++;
        } else if (player == 'O') {
            playerOScore++;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the grid
        g.setColor(Color.BLACK);
        for (int i = 1; i < 3; i++) {
            g.drawLine(0, i * 100, getWidth(), i * 100);
            g.drawLine(i * 100, 0, i * 100, getHeight());
        }

        // Draw X and O symbols
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    drawX(g, j * 100, i * 100);
                } else if (board[i][j] == 'O') {
                    drawO(g, j * 100, i * 100);
                }
            }
        }
    }

    private void drawX(Graphics g, int x, int y) {
        g.setColor(Color.RED);
        g.drawLine(x, y, x + 100, y + 100);
        g.drawLine(x, y + 100, x + 100, y);
    }

    private void drawO(Graphics g, int x, int y) {
        g.setColor(Color.BLUE);
        g.drawOval(x, y, 100, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeGame game = new TicTacToeGame();
            game.setVisible(true);
        });
    }
}
