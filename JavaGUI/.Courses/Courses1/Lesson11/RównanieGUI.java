// [Programowanie Java GUI - lekcja 11: RownanieGUI cz1] - https://www.youtube.com/watch?v=buC22slu3FQ&list=PL3298E3EB8CFDE9BA&index=11

package Lesson11;

import javax.swing.*;

public class RównanieGUI extends JFrame {

    private JTextField tA, tB, tC, tWynik;
    private JLabel lA, lB, lC;
    private JButton bWyjście, bRozwiąż;

    public RównanieGUI(){
        setSize(400,400);
        setTitle("Aplikacja równania kwadratowego");
        setLayout(null);

        lA = new JLabel("a:", JLabel.RIGHT);
        lA.setBounds(10,50,30,20);
        tA = new JTextField();
        tA.setBounds(50,50,50,20);
        tA.setToolTipText("Podaj wspólczynnik a");

        add(tA);
        add(lA);

        lB = new JLabel("b:", JLabel.RIGHT);
        lB.setBounds(110,50,30,20);
        tB = new JTextField();
        tB.setBounds(150,50,50,20);
        tB.setToolTipText("Podaj wspólczynnik b");

        add(tB);
        add(lB);

        lC = new JLabel("c:", JLabel.RIGHT);
        lC.setBounds(210,50,30,20);
        tC = new JTextField();
        tC.setBounds(250,50,50,20);
        tC.setToolTipText("Podaj wspólczynnik c");

        add(tC);
        add(lC);
    }

    public static void main(String[] args) {
        RównanieGUI okno = new RównanieGUI();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }
}
