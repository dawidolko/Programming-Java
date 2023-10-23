import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JButton OKButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private javax.swing.JPanel JPanel;
    private JPanel JPanelMain;
    private JLabel JLabel1;
    private JLabel JLabel2;
    private JButton cofnijButton;

    public Zadanie1(){
        super("PasswordChecker");
        this.setContentPane(this.JPanelMain);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField1.getPassword());
                String confirmPassword = new String(passwordField2.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals("codejava")) {
                    JOptionPane.showMessageDialog(null, "Wrong password!", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField1.getPassword());
                String confirmPassword = new String(passwordField2.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals("codejava")) {
                    JOptionPane.showMessageDialog(null, "Wrong password!", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        passwordField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField1.getPassword());
                String confirmPassword = new String(passwordField2.getPassword());

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(null, "Passwords do not match", "Message", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals("codejava")) {
                    JOptionPane.showMessageDialog(null, "Wrong password!", "Message", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password.", "Message", JOptionPane.INFORMATION_MESSAGE);
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
        Zadanie1 app = new Zadanie1();
        app.setVisible(true);
    }

}
