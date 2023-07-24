package giereczka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Klikacz extends JFrame {

    private static final int WINDOW_WIDTH = 400;
    private static final int WINDOW_HEIGHT = 400;
    private static final int BUTTON_SIZE = 80;
    private static final int GAME_DURATION_SECONDS = 30;

    private int score;
    private JLabel scoreLabel;
    private JButton clickButton;
    private Timer timer;
    private Random random;
    private long startTime;

    public Klikacz() {
        setTitle("Klikacz");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(scoreLabel, BorderLayout.NORTH);

        clickButton = new JButton("Kliknij mnie!");
        clickButton.setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
        add(clickButton, BorderLayout.CENTER);

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseScore();
                relocateButton();
            }
        });

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimer();
            }
        });

        random = new Random();
        score = 0;
        startTime = System.currentTimeMillis();
        relocateButton();
    }

    private void increaseScore() {
        score++;
        scoreLabel.setText("Score: " + score);
    }

    private void relocateButton() {
        int x = random.nextInt(WINDOW_WIDTH - BUTTON_SIZE);
        int y = random.nextInt(WINDOW_HEIGHT - BUTTON_SIZE);
        clickButton.setLocation(x, y);
    }

    private void updateTimer() {
        long currentTime = System.currentTimeMillis();
        int elapsedTimeSeconds = (int) ((currentTime - startTime) / 1000);
        int remainingSeconds = GAME_DURATION_SECONDS - elapsedTimeSeconds;

        if (remainingSeconds <= 0) {
            timer.stop();
            clickButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Koniec gry! Twój wynik: " + score, "Koniec gry", JOptionPane.INFORMATION_MESSAGE);
        } else {
            setTitle("Klikacz - Pozostały czas: " + remainingSeconds + "s");
        }
    }

    public void startGame() {
        timer.start();
        setVisible(true);
    }
}
