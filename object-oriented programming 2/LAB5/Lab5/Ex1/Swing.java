import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Calendar;

public class Swing extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JButton newTaskButton;
    protected JList toDoList;
    protected JList inProgressList;
    protected JList doneList;
    private JButton closeButton;
    private JButton backButton;
    private JPanel filePanel;
    private JPanel aboutPanel;
    private JTextField toJestTekstTextField;
    private JPopupMenu popupMenu;
    private JMenuItem menuItemEdit;
    private JMenuItem menuItemRemove;
    private JMenuItem menuItemNext;
    private JMenuItem menuItemPrev;

    protected static ArrayList<Task> firstListData = new ArrayList<Task>();
    protected static ArrayList<Task> secondListData = new ArrayList<Task>();
    protected static ArrayList<Task> thirdListData = new ArrayList<Task>();

    static DefaultListModel toDo = new DefaultListModel<String>();
    static DefaultListModel progress = new DefaultListModel<String>();
    static DefaultListModel done = new DefaultListModel<String>();

    public Swing() {
        super("Kanban");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setBounds(100, 100, 400, 300);

        toDoList.setModel(toDo);
        inProgressList.setModel(progress);
        doneList.setModel(done);

        popupMenu = new JPopupMenu();
        menuItemNext = new JMenuItem("Move next");
        menuItemPrev = new JMenuItem("Move previous");
        menuItemEdit = new JMenuItem("Edit");
        menuItemRemove = new JMenuItem("Delete");
        popupMenu.add(menuItemNext);
        popupMenu.add(menuItemPrev);
        popupMenu.add(menuItemEdit);
        popupMenu.add(menuItemRemove);
        toDoList.setComponentPopupMenu(popupMenu);
        inProgressList.setComponentPopupMenu(popupMenu);
        doneList.setComponentPopupMenu(popupMenu);

        menuItemRemove.addActionListener(e -> {
            JList list = (JList) popupMenu.getInvoker();
            int index = list.getSelectedIndex();
            if (index>-1) {
                if (list.equals(toDoList)) {
                    firstListData.remove(index);
                    toDo.remove(index);
                } else if (list.equals(inProgressList)) {
                    secondListData.remove(index);
                    progress.remove(index);
                } else {
                    thirdListData.remove(index);
                    done.remove(index);
                }
        }
        });

        menuItemNext.addActionListener(e -> {
            JList list = (JList) popupMenu.getInvoker();
            int index = list.getSelectedIndex();
            if (index>-1) {
                if (list.equals(toDoList)) {
                    progress.addElement(toDo.get(index));
                    toDo.remove(index);
                    secondListData.add(firstListData.get(index));
                    firstListData.remove(index);
                } else if (list.equals(inProgressList)) {
                    done.addElement(progress.get(index));
                    progress.remove(index);
                    thirdListData.add(secondListData.get(index));
                    secondListData.remove(index);
                }
            }
        });

        menuItemPrev.addActionListener(e -> {
            JList list = (JList) popupMenu.getInvoker();
            int index = list.getSelectedIndex();
            if (index>-1) {
                if (list.equals(inProgressList)) {
                    toDo.addElement(progress.get(index));
                    progress.remove(index);
                    firstListData.add(secondListData.get(index));
                    secondListData.remove(index);
                } else if (list.equals(doneList)) {
                    progress.addElement(done.get(index));
                    done.remove(index);
                    secondListData.add(thirdListData.get(index));
                    thirdListData.remove(index);
                }
            }
        });

        menuItemEdit.addActionListener(e -> {
            JList list = (JList)popupMenu.getInvoker();
            int index = list.getSelectedIndex();
            if (index > -1) {
                Task tsk;
                if (list.equals(toDoList)) {
                    tsk = firstListData.get(index);
                } else if (list.equals(inProgressList)) {
                    tsk = secondListData.get(index);
                } else {
                    tsk = thirdListData.get(index);
                }

                String title = tsk.getTitle();
                Calendar date = tsk.getExpiration();
                String priority = tsk.getPriority();
                editTask.run(title, date, priority);
            }
        });

        newTaskButton.addActionListener(e -> editTask.run("", null, ""));
        backButton.addActionListener(e -> tabbedPane1.setSelectedIndex(0));
        closeButton.addActionListener(e -> dispose());

        toDoList.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                JList l = (JList)e.getSource();
                int index = l.locationToIndex(e.getPoint());
                if(index>-1) {
                    Task tasks = firstListData.get(index);
                    l.setToolTipText(tasks.getDescription());
                }
            }
        });

        inProgressList.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                JList l = (JList)e.getSource();
                int index = l.locationToIndex(e.getPoint());
                if(index>-1) {
                    Task tasks = secondListData.get(index);
                    l.setToolTipText(tasks.getDescription());
                }
            }
        });

        doneList.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                JList l = (JList)e.getSource();
                int index = l.locationToIndex(e.getPoint());
                if(index>-1) {
                    Task tasks = thirdListData.get(index);
                    l.setToolTipText(tasks.getDescription());
                }
            }
        });
    }

    public static void main(String[] args) {
        firstListData.add(new Task("Zmywanie", "Zmywanie naczyn", Calendar.getInstance(), "Low"));
        toDo.addElement("Zmywanie");
        secondListData.add(new Task("Sprzatanie", "Posprzatanie mieszkania", Calendar.getInstance(), "High"));
        progress.addElement("Sprzatanie");
        thirdListData.add(new Task("Praca domowa", "Odrob zadania na uczelnie", Calendar.getInstance(), "High"));
        done.addElement("Praca domowa");

        Swing frame = new Swing();
        frame.setVisible(true);
    }
}
