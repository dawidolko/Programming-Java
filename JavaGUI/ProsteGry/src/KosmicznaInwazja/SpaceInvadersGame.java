package KosmicznaInwazja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class SpaceInvadersGame extends JFrame {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int PLAYER_WIDTH = 50;
    private static final int PLAYER_HEIGHT = 30;
    private static final int ENEMY_WIDTH = 30;
    private static final int ENEMY_HEIGHT = 30;
    private static final int BULLET_WIDTH = 5;
    private static final int BULLET_HEIGHT = 15;
    private static final int PLAYER_SPEED = 5;
    private static int ENEMY_SPEED = 2;
    private static final int BULLET_SPEED = 10;
    private static final int ENEMY_ROWS = 5;
    private static final int ENEMY_COLUMNS = 10;

    private ArrayList<Rectangle> enemies;
    private Rectangle player;
    private ArrayList<Rectangle> bullets;
    private boolean isGameOver;
    private int score;

    public SpaceInvadersGame() {
        setTitle("Kosmiczna Inwazja");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        player = new Rectangle(FRAME_WIDTH / 2 - PLAYER_WIDTH / 2, FRAME_HEIGHT - PLAYER_HEIGHT - 10, PLAYER_WIDTH, PLAYER_HEIGHT);
        enemies = new ArrayList<>();
        bullets = new ArrayList<>();
        isGameOver = false;
        score = 0;

        createEnemies();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isGameOver) {
                    restartGame();
                }
            }
        });

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_LEFT) {
                    movePlayerLeft();
                } else if (key == KeyEvent.VK_RIGHT) {
                    movePlayerRight();
                } else if (key == KeyEvent.VK_SPACE) {
                    shoot();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isGameOver) {
                    moveEnemies();
                    moveBullets();
                    checkCollisions();
                    repaint();
                }
            }
        });
        timer.start();

        setFocusable(true);
        requestFocus();
    }

    private void createEnemies() {
        int initialX = 100;
        int initialY = 50;

        for (int row = 0; row < ENEMY_ROWS; row++) {
            for (int col = 0; col < ENEMY_COLUMNS; col++) {
                Rectangle enemy = new Rectangle(initialX + col * 60, initialY + row * 50, ENEMY_WIDTH, ENEMY_HEIGHT);
                enemies.add(enemy);
            }
        }
    }

    private void moveEnemies() {
        for (Rectangle enemy : enemies) {
            enemy.x += ENEMY_SPEED;

            if (enemy.x + ENEMY_WIDTH >= FRAME_WIDTH || enemy.x <= 0) {
                ENEMY_SPEED = -ENEMY_SPEED;
                enemy.y += 10;
            }
        }
    }

    private void movePlayerLeft() {
        if (player.x - PLAYER_SPEED >= 0) {
            player.x -= PLAYER_SPEED;
        }
    }

    private void movePlayerRight() {
        if (player.x + PLAYER_WIDTH + PLAYER_SPEED <= FRAME_WIDTH) {
            player.x += PLAYER_SPEED;
        }
    }

    private void moveBullets() {
        ArrayList<Rectangle> bulletsToRemove = new ArrayList<>();

        for (Rectangle bullet : bullets) {
            bullet.y -= BULLET_SPEED;

            if (bullet.y <= 0) {
                bulletsToRemove.add(bullet);
            }
        }

        bullets.removeAll(bulletsToRemove);
    }

    private void shoot() {
        Rectangle bullet = new Rectangle(player.x + PLAYER_WIDTH / 2 - BULLET_WIDTH / 2, player.y - BULLET_HEIGHT, BULLET_WIDTH, BULLET_HEIGHT);
        bullets.add(bullet);
    }

    private void checkCollisions() {
        ArrayList<Rectangle> enemiesToRemove = new ArrayList<>();
        ArrayList<Rectangle> bulletsToRemove = new ArrayList<>();

        for (Rectangle bullet : bullets) {
            for (Rectangle enemy : enemies) {
                if (bullet.intersects(enemy)) {
                    enemiesToRemove.add(enemy);
                    bulletsToRemove.add(bullet);
                    score += 10;
                }
            }
        }

        enemies.removeAll(enemiesToRemove);
        bullets.removeAll(bulletsToRemove);

        if (enemies.isEmpty()) {
            isGameOver = true;
        }

        for (Rectangle enemy : enemies) {
            if (enemy.intersects(player)) {
                isGameOver = true;
            }
        }
    }

    private void restartGame() {
        enemies.clear();
        bullets.clear();
        createEnemies();
        player.x = FRAME_WIDTH / 2 - PLAYER_WIDTH / 2;
        isGameOver = false;
        score = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw player
        g.setColor(Color.BLUE);
        g.fillRect(player.x, player.y, player.width, player.height);

        // Draw enemies
        g.setColor(Color.RED);
        for (Rectangle enemy : enemies) {
            g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
        }

        // Draw bullets
        g.setColor(Color.GREEN);
        for (Rectangle bullet : bullets) {
            g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
        }

        // Draw score and game over message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString("Score: " + score, 10, 30);

        if (isGameOver) {
            g.drawString("Game Over", FRAME_WIDTH / 2 - 50, FRAME_HEIGHT / 2);
            g.drawString("Click to play again", FRAME_WIDTH / 2 - 70, FRAME_HEIGHT / 2 + 30);
        }
    }
}
