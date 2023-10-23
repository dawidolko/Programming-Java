import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cwiczenie2 extends JFrame{
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macinosRadioButton;
    private JLabel JLabelImage;
    private JButton OKButton;
    private JButton cofnijButton;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.svg.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("macbook.png"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public Cwiczenie2() {
        super("RadioPrzycisk");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(450, 450);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption="Nic nie wybrano";
                if(linuxRadioButton.isSelected()) selectOption = "Linux";
                if(windowsRadioButton.isSelected()) selectOption = "Windows";
                if(macinosRadioButton.isSelected()) selectOption = "Macbook";

                JOptionPane.showMessageDialog(Cwiczenie2.this, "wybrano : " + selectOption);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconLinux,120,120));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconWindows,120,120));
                }
            }
        });
        macinosRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macinosRadioButton.isSelected()){
                    JLabelImage.setIcon(resize(iconMac,120,120));
                }
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
        Cwiczenie2 radio = new Cwiczenie2();
        radio.setVisible(true);
    }

}
