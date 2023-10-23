import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Password extends JFrame
{
    private JPanel JPanel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel JPanel3;
    private JPanel JPanel2;
    private JLabel JLabelOutput;
    String  user = "admin", password="admin";

    public Password(){
        super("login panel");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,200);

        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField1.getText();
                String userPassword = new String(passwordField1.getPassword());

                if(userInput.equals(user) && userPassword.equals(password)){
                    JLabelOutput.setText("Zalogowano do systemu...");
                }else{
                    JLabelOutput.setText("Podane bledne dane ... sprobuj ponowanie...");
                    textField1.setText("");
                    passwordField1.setText("");
                }
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField1.getText();
                String userPassword = new String(passwordField1.getPassword());

                if(userInput.equals(user) && userPassword.equals(password)){
                    JLabelOutput.setText("Zalogowano do systemu...");
                }else{
                    JLabelOutput.setText("Podane bledne dane ... sprobuj ponowanie...");
                    textField1.setText("");
                    passwordField1.setText("");
                }
            }
        });

    }

    public static void main(String[] args) {
        Password password = new Password();
        password.setVisible(true);
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
