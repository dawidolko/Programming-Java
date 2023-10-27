package Zadanie1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Ex1 extends JFrame {
    private JPanel mainPanel;
    private JButton firstButton;
    private JButton secondButton;
    private JButton thirdButton;
    private JButton fourthButton;
    private JList<String> firstList;
    private JList<String> secondList;

    private static List<String> firstListData = new ArrayList<String>();
    private static List<String> secondListData = new ArrayList<String>();

    public Ex1() {
        super("Listy dynamiczne");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(200, 200, 400, 350);
        createLists();

        firstButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = firstList.getSelectedIndex();
                if (index != -1) {
                    secondListData.add(firstListData.get(index));
                    firstListData.remove(index);
                    createLists();
                }
            }
        });

        secondButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (String elem : firstListData) {
                    secondListData.add(elem);
                }
                firstListData.clear();
                createLists();
            }
        });

        thirdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = secondList.getSelectedIndex();
                if (index != -1) {
                    firstListData.add(secondListData.get(index));
                    secondListData.remove(index);
                    createLists();
                }
            }
        });

        fourthButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (String elem : secondListData) {
                    firstListData.add(elem);
                }
                secondListData.clear();
                createLists();
            }
        });
    }

    public static void main(String[] args) {
        firstListData.add("C");
        firstListData.add("C++");
        firstListData.add("C#");
        firstListData.add("Java");

        secondListData.add("R");
        secondListData.add("Python");
        secondListData.add("SQL");

        Ex1 frame = new Ex1();
        frame.setVisible(true);
    }

    public void createLists() {
        final DefaultListModel firstModel = new DefaultListModel();
        for (String e : firstListData) {
            firstModel.addElement(e);
        }

        firstList.setModel(firstModel);

        final DefaultListModel secondModel = new DefaultListModel();
        for (String e : secondListData) {
            secondModel.addElement(e);
        }

        secondList.setModel(secondModel);
    }
}
