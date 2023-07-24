package PingPong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Pingpong  extends JPanel implements KeyListener, ActionListener {
    //podstawowe parametry
   //różne paramatry głónie przechowujące pozycje różnych obiektów
    private int pilkaX = 0 , pilkaY = 5,gracz1X = 200, gracz1Y = 0, gracz2X = 0, gracz2Y = 650;
    private int poruszanieX = 0, poruszanieY = 4;
    private int dlugoscPaletki=90;
    private int punkty2 , punkty1;
    //zmienna przechowująca ruch
    private Random random = new Random();
    //zmienna przechowująca czas
    private Timer time;
    public Pingpong(){
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        //uruchomienie gry
        time = new Timer(10, this);
        time.start();
    }
    public void paint(Graphics g){
        //stworzenie planszy
        g.setColor(Color.BLACK);
        g.fillRect(0,0,2000,2000);
        g.setColor(Color.GRAY);
        g.fillRect(375,0,1,800);
        g.setColor(Color.WHITE);
        g.fillRect(0,325,800,4);
        //piłka
        g.setColor(Color.CYAN);
        g.fillRect(pilkaX,pilkaY,10,10);
        //paletka 1
        g.setColor(Color.red);
        g.fillRect(gracz1X,gracz1Y, dlugoscPaletki,5);
        //paletka 2
        g.setColor(Color.BLUE);
        g.fillRect(gracz2X,gracz2Y,dlugoscPaletki,5);
        //punkty
        g.setColor(Color.green);
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Gracz1: " + punkty1 +" : "+ punkty2 + " :Gracz2",10,675);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //odświeżanie planszy
        repaint();
        pilkaY += poruszanieY;
        pilkaX += poruszanieX;
        //tworzenie obiektów na planszy
        Rectangle gracz1 = new Rectangle(gracz1X,gracz1Y, dlugoscPaletki,5);
        Rectangle gracz2 = new Rectangle(gracz2X,gracz2Y, dlugoscPaletki,5);
        Rectangle pilka = new Rectangle(pilkaX,pilkaY,10,10);
        if(pilka.intersects(gracz1)|| pilka.intersects(gracz2)){
            System.out.println(pilkaY);
            //fizyka odbijania piłki
            if(pilkaY>600){
                poruszanieY = (-1)*Math.abs(random.nextInt()%10);
                poruszanieX = random.nextInt()%10;
            }
            if(pilkaY<10){
                poruszanieY = poruszanieY*-1;
            }
        }
        if(pilkaX<=0){
            poruszanieX = -poruszanieX;
        }
        if(pilkaX>750){
            poruszanieX = -poruszanieX;
        }
        if(pilkaY <0){
            punkty2++;
            time.stop();
        }
        if(pilkaY>700){
            punkty1++;
            time.stop();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //ruch czerwonej paletki
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(gracz1X>0)gracz1X-=10;
            else gracz1X = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(gracz1X<750)gracz1X+=10;
            else gracz1X = 750;
        }
        //ruch niebieskiej paletki
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(gracz2X>0) gracz2X -=10;
            else gracz2X = 0;
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(gracz2X<750) gracz2X +=10;
            else gracz2X = 750;
        }
        //jeśli naciśnie się enter zaczyna się spokojne rozpoczęcie
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            reset();
        }
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
    //reset gry, gra rozpoczyna się spokojnie
    private void reset(){
        pilkaX = 20;
        pilkaY = 20;
        time.start();
        poruszanieX = 0;
        poruszanieY = 2;
    }
}
