import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class Cwiczenie1 extends JFrame {
    private JFrame frame;
    private JPanel mainPanel;
    private JTree tree1;
    private JTextField textField1;
    private JTextField textField2;
    private JScrollBar scrollBar1;
    private JButton opłaćKursButton;
    private JButton wyjścieButton;

    public Cwiczenie1() {
        super("Lista kursów");
        this.setSize(500,500);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Utworzenie zawartości dla JTree zgodnie z obrazem
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");
        DefaultMutableTreeNode programowanie = new DefaultMutableTreeNode("Programowanie");
        programowanie.add(new DefaultMutableTreeNode("C++"));
        programowanie.add(new DefaultMutableTreeNode("C#"));
        programowanie.add(new DefaultMutableTreeNode("JAVA"));
        programowanie.add(new DefaultMutableTreeNode("Python"));
        programowanie.add(new DefaultMutableTreeNode("ASP.NET"));

        DefaultMutableTreeNode grafika = new DefaultMutableTreeNode("Grafika komputerowa");
        grafika.add(new DefaultMutableTreeNode("Adobe Photoshop"));
        grafika.add(new DefaultMutableTreeNode("CorelDRAW"));
        grafika.add(new DefaultMutableTreeNode("Adobe InDesign"));

        root.add(programowanie);
        root.add(grafika);

        tree1.setModel(new javax.swing.tree.DefaultTreeModel(root));
        tree1.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        tree1.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree1.getLastSelectedPathComponent();
            if (selectedNode != null && selectedNode.isLeaf()) { // Upewnij się, że wybrany węzeł jest liściem
                textField1.setText(selectedNode.toString());
                textField2.setText("5 000,00 PLN");  // przykładowa wartość ceny
            }
        });

        opłaćKursButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Podaj swoje dane:");
            if (name != null && !name.trim().isEmpty()) {
                String kurs = textField1.getText();
                String cena = textField2.getText();
                JOptionPane.showMessageDialog(frame, "Opłaciłeś kurs: " + kurs + " za " + cena);
            }
        });

        wyjścieButton.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        Cwiczenie1 frame = new Cwiczenie1();
        frame.setVisible(true);
    }
}
