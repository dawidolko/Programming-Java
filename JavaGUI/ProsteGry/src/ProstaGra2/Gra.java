package ProstaGra2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;


public class Gra extends JPanel implements KeyListener, ActionListener {
    private int x =300;
    private Timer time;
    private boolean bl = true;
    private int speed = 20;
    private int ex[] = new int[]{0,100,200,300,400,500,600,700};
    private int ey = 10;
    private int zycie = 3;
    private int speedEntity = 5;
    private int punkty = 0;
    private int e =100;
    private Random rnd = new Random();
    private int you;

    private int liczby=58;
    private int rdnx;
    private boolean wlacz = false;
    public Gra() {
        repaint();
        time = new Timer(10,this);
        you = rnd.nextInt(7);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }
    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(0,0,700,600);
        //text
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Zycia: "+zycie,550,20);
        g.drawString("Punkty: "+punkty,550,50);
        //Gracz
        g.setColor(Color.CYAN);
        g.fillRect(x,450,100,100);
        //Wróg
        g.setColor(Color.red);
        ex[you] = -100;
        g.fillRect(ex[0],ey,100,100);
        g.fillRect(ex[1],ey,100,100);
        g.fillRect(ex[2],ey,100,100);
        g.fillRect(ex[3],ey,100,100);
        g.fillRect(ex[4],ey,100,100);
        g.fillRect(ex[5],ey,100,100);
        g.fillRect(ex[6],ey,100,100);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
            ey+=speedEntity;
            Rectangle en[] = new Rectangle[7];
            en[0] = new Rectangle(ex[0],ey,100,100);
            en[1] = new Rectangle(ex[1],ey,100,100);
            en[2] = new Rectangle(ex[2],ey,100,100);
            en[3] = new Rectangle(ex[3],ey,100,100);
            en[4] = new Rectangle(ex[4],ey,100,100);
            en[5] = new Rectangle(ex[5],ey,100,100);
            en[6] = new Rectangle(ex[6],ey,100,100);

            Rectangle pl = new Rectangle(x,475,100,100);


            for(int i = 0;i<7;i++){
                if(en[i].intersects(pl)){
                    liczby--;
                    System.out.println(liczby);
                    if(liczby == 0){
                    liczby = 58;
                    zycie--;
                    }

                }
                if(zycie == 0){
                    time.stop();
                    bl = false;
                }
                if(ey == 700){
                    punkty++;
                    ey = 10;
                    switch (you){
                        case 0:
                            ex[0] = 0;
                            break;
                        case 1:
                            ex[1] = 100;
                            break;
                        case 2:
                            ex[2] = 200;
                            break;
                        case 3:
                            ex[3] = 300;
                            break;
                        case 4:
                            ex[4] = 400;
                            break;
                        case 5:
                            ex[5] = 500;
                            break;
                        case 6:
                            ex[6] = 600;
                            break;
                    }
                    you = rnd.nextInt(7);
                }
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(bl){
        if(wlacz){
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(x == 0){
                x=0;
            }else {
                x -= speed;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(x == 600){
                x = 600;
            }else{
                x+=speed;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(x == 0){
                x=0;
            }else {
                x -= speed;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(x == 600){
                x = 600;
            }else{
                x+=speed;
            }
        }
        }
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            wlacz = true;
            time.start();
        }
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            time.stop();
        }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            reset();
        }
    }

    private void reset() {
        ey = 10;
        zycie = 3;
        punkty = 0;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
