// [Programowanie Java GUI - lekcja 12: RownanieGUI cz2] - https://www.youtube.com/watch?v=buC22slu3FQ&list=PL3298E3EB8CFDE9BA&index=12

package Lesson12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RównanieGUI extends JFrame implements ActionListener {

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

        bRozwiąż = new JButton("Rozwiąż równanie");
        bRozwiąż.setBounds(50,150,150,20);
        add(bRozwiąż);
        bRozwiąż.addActionListener(this);

        bWyjście = new JButton("Wyjście");
        bWyjście.setBounds(250,150,100,20);
        bWyjście.addActionListener(this);

        add(bWyjście);

        tWynik = new JTextField();
        tWynik.setBounds(50,200,400,20);
        add(tWynik);
    }

    public static void main(String[] args) {
        RównanieGUI okno = new RównanieGUI();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zmiana = e.getSource();
        if(zmiana==bWyjście){
            dispose();
        }else if(zmiana==bRozwiąż){
            int a = Integer.parseInt(tA.getText()); // rzutowanie
            int b = Integer.parseInt(tB.getText()); // rzutowanie
            int c = Integer.parseInt(tC.getText()); // rzutowanie

            RównanieKwadratowe równanie = new RównanieKwadratowe(a,b,c);
            String rozwiązanie = równanie.rozwiąż();
            tWynik.setText(rozwiązanie);

        }
    }
}
