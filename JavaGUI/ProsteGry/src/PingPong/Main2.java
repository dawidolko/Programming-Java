package PingPong;

import javax.swing.*;

public class Main2 {
    public static void main(String[] args){
        JFrame gra = new JFrame("Ping-Pong!!");
        gra.setBounds(300,300,800,740);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setResizable(false);
        gra.setVisible(true);
        Pingpong pingpong = new Pingpong();
        gra.add(pingpong);
    }
}
