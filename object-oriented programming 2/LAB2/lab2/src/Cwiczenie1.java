import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cwiczenie1 extends JFrame
{
    private JPanel JPanel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel JPanel3;
    private JPanel JPanel2;
    private JLabel JLabelOutput;
    String  user = "admin", password="admin";

    public Cwiczenie1(){
        super("login panel");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);

        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField1.getText();
                String userPassword = new String(passwordField1.getPassword());

                if(userInput.equals(user) && userPassword.equals(password)){
//                    JLabelOutput.setText("Zalogowano do systemu...");
//                    JLabelOutput.setText("UserName: admin, Password: admin");
                    JLabelOutput.setText("Username: "+user+" Password: "+password);
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

                if(userInput.equals(user) && userPassword.equals(password)){ //<-- ten warunek robi przejscie.
//                    JLabelOutput.setText("Zalogowano do systemu...");
//                    JLabelOutput.setText("UserName: admin, Password: admin");
                    JLabelOutput.setText("Username: "+user+" Password: "+password);
                    dispose();
                    Cwiczenie2 obj = new Cwiczenie2();
                    obj.setVisible(true);
                }else{
                    JLabelOutput.setText("Podane bledne dane ... sprobuj ponowanie...");
                    textField1.setText("");
                    passwordField1.setText("");
                }
            }
        });

    }

    public static void main(String[] args) {
        Cwiczenie1 cwiczenie1 = new Cwiczenie1();
        cwiczenie1.setVisible(true);
    }

}
