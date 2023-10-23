import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonSystem extends JFrame{
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macinosRadioButton;
    private JLabel JLabelImage;
    private JButton OKButton;

    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("Linux.svg.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("windows.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("macbook.png"));

    private static ImageIcon resize(ImageIcon src, int destWidth, int destHeight){
        return new ImageIcon(src.getImage().getScaledInstance(destWidth,destHeight, Image.SCALE_SMOOTH));
    }

    public RadioButtonSystem() {
        super("RadioPrzycisk");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(450, 450);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectOption="";
                if(linuxRadioButton.isSelected()) selectOption = "Linux";
                if(windowsRadioButton.isSelected()) selectOption = "Windows";
                if(macinosRadioButton.isSelected()) selectOption = "Macbook";

                JOptionPane.showMessageDialog(RadioButtonSystem.this, "wybrano : " + selectOption);
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
    }

    public static void main(String[] args) {
        RadioButtonSystem radio = new RadioButtonSystem();
        radio.setVisible(true);
    }

}
