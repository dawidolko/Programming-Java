import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JPanel JPanelMain;
    private JPanel JPanel1;
    private JPanel JPanel2;
    private JButton wyjścieButton;
    private JButton counterCoursesButton;
    private JButton passwordCheckerButton;
    private JButton selectSystemsButton;

    public Zadanie2(){
        super("All Apps");
        this.setContentPane(this.JPanelMain);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectSystemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Cwiczenie2 radio = new Cwiczenie2();
                radio.setVisible(true);
            }
        });
        passwordCheckerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie1 app = new Zadanie1();
                app.setVisible(true);
            }
        });
        counterCoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Cwiczenie3 obj = new Cwiczenie3();
                obj.setVisible(true);
            }
        });
        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        Zadanie2 app = new Zadanie2();
        app.setVisible(true);
    }
}
