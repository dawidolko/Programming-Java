import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cwiczenie3 extends JFrame {
    private JButton OKButton;
    private JCheckBox javaCheckBox;
    private JCheckBox cppCheckBox;
    private JCheckBox csCheckBox;
    private JCheckBox pythonCheckBox;
    private JPanel JPanel1;
    private JButton cofnijButton;

    public Cwiczenie3(){
        super("Kursy programowania");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cena = 0;
                String msg="";
                if(javaCheckBox.isSelected()){
                    cena+=3500;
                    msg+="Java $price 3500,00pln\n";
                }
                if(pythonCheckBox.isSelected()){
                    cena+=5000;
                    msg+="Python $price 5000,00pln\n";
                }
                if(cppCheckBox.isSelected()){
                    cena+=4000;
                    msg+="C++ $price 4000,00pln\n";
                }
                if(csCheckBox.isSelected()){
                    cena+=3000;
                    msg+="C# $price 3000,00pln\n";
                }

                msg+="===============================\n";

                JOptionPane.showMessageDialog(null,msg+"Razem "+cena);
            }
        });
        cofnijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie2 app = new Zadanie2();
                app.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Cwiczenie3 kurs = new Cwiczenie3();
        kurs.setVisible(true);
    }
}
