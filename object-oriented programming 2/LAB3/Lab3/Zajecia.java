import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zajecia extends JFrame{

    private JComboBox comboBox1;
    private JPanel wyswietlacz;
    private JLabel lText;
    private JTable table1;
    private JList list1;

    public static void main(String[] args){
        Zajecia zajecia = new Zajecia();
        zajecia.setVisible(true);
    }

    public Zajecia(){
        super("Przycisk");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.wyswietlacz);

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "Elemenmt wybrany: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                lText.setText(text);
            }
        });
        createTable();
    }

    private void createTable(){
        Object[][] data = {
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3},
                {"Jan", "Nowak", "Informatyka" , 3}
        };
        table1.setModel(new DefaultTableModel(
                data,
                new String[] {"Imię", "Nazwisko", "Kierunke", "Numer semetru"}
        ));
        TableColumnModel columnModel = table1.getColumnModel();
        columnModel.getColumn(0).setMinWidth(200);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        columnModel.getColumn(1).setCellRenderer(cellRenderer);
    }
}
