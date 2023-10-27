import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zadanie1 extends JFrame{
    private JPanel mainPanel;
    private JList<Object> list;
    private JTextField nameField;
    private JTextField numberField;
    private JTextField addressField;
    private JTextField birthField;
    private JLabel yearsLabel;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JTextField emailField;

    private static List<Object> listData = new ArrayList<Object>();
    final private static Object[] jk = {"Jan Kowalski", "jk132441@stud.ur.edu.pl", "534 439 523", "ul. Ochotnicza 4", LocalDate.of(2001, 4, 14)};
    final private static Object[] mn = {"Marian Nowak", "jnowak@ur.edu.pl", "549 871 221", "ul. Strażacka 58", LocalDate.of(1991, 12, 13)};
    final private static Object[] jn = {"Janina Urban", "jn122267@stud.ur.edu.pl", "501 312 495", "ul. Krzywa 102", LocalDate.of(1999, 1, 27)};
    final private static Object[] en = {"Ewelina Nowak-Maciąg", "ewelcia@gmail.com", "487 675 291", "ul. Matysowska 102", LocalDate.of(1989, 6, 19)};
    private static List<String> names = new ArrayList<String>();

    public Zadanie1() {
        super("Contact Form");
        this.setContentPane(mainPanel);
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        listData.addAll(List.of(jk));
        listData.addAll(List.of(mn));
        listData.addAll(List.of(jn));
        listData.addAll(List.of(en));

        names.add(String.valueOf(jk[0]));
        names.add(String.valueOf(mn[0]));
        names.add(String.valueOf(jn[0]));
        names.add(String.valueOf(en[0]));

        createList();

        saveNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                List<Object> newContact = new ArrayList<Object>();
                newContact.add(nameField.getText());
                newContact.add(emailField.getText());
                newContact.add(numberField.getText());
                newContact.add(addressField.getText());
                newContact.add(LocalDate.parse(String.valueOf(birthField.getText())));

                listData.addAll(newContact);
                names.add(String.valueOf(newContact.get(0)));

                int birth = LocalDate.parse(newContact.get(4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;

                yearsLabel.setText(years + " years");
                createList();
            }
        });

        saveExistingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = list.getSelectedIndex();

                listData.set(index*5, nameField.getText());
                listData.set(index*5 + 1, emailField.getText());
                listData.set(index*5 + 2, numberField.getText());
                listData.set(index*5 + 3, addressField.getText());
                listData.set(index*5 + 4, LocalDate.parse(String.valueOf(birthField.getText())));

                names.set(index, nameField.getText());

                int birth = LocalDate.parse(listData.get(index*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;
                yearsLabel.setText(years + " years");

                createList();
                saveExistingButton.setEnabled(false);
            }
        });

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int index = list.getSelectedIndex();

                nameField.setText(listData.get(index*5).toString());
                emailField.setText(listData.get(index*5 + 1).toString());
                numberField.setText(listData.get(index*5 + 2).toString());
                addressField.setText(listData.get(index*5 + 3).toString());
                birthField.setText(listData.get(index*5 + 4).toString());

                int birth = LocalDate.parse(listData.get(index*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();

                int years = now - birth;
                yearsLabel.setText(years + " years");

                saveExistingButton.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        Zadanie1 frame = new Zadanie1();
        frame.setVisible(true);
    }

    public void createList() throws IndexOutOfBoundsException {
        try {
            DefaultListModel model = new DefaultListModel();
            model.addAll(names);
            list.setModel(model);
        } catch(IndexOutOfBoundsException e) {}
    }
}
