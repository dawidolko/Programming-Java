package Przyklad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample extends JFrame implements ActionListener {
    // JFrame
    static JFrame f;
    // JButton
    static JButton b, b1, b2, b3;
    // label to display text
    static JLabel l, l1;
    // text area
    static JTextArea jt;
    // default constructor
    TextAreaExample(){ }
    // main class
    public static void main(String[] args)
    {
// create a new frame to store text field and button
        f = new JFrame("textfield");
// create a label to display text
        l = new JLabel("nothing entered");
        l1 = new JLabel("0 lines");
// create a new buttons
        b = new JButton("submit");
        b1 = new JButton("plain");
        b2 = new JButton("italic");
        b3 = new JButton("bold");
// create a object of the text class
        TextAreaExample te = new TextAreaExample();
// addActionListener to button
        b.addActionListener(te);
        b1.addActionListener(te);
        b2.addActionListener(te);
        b3.addActionListener(te);
// create a text area, specifying the rows and columns
        jt = new JTextArea("please write something ", 10, 10);
        JPanel p = new JPanel();
// add the text area and button to panel
        p.add(jt);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.add(l1);
        f.add(p);
// set the size of frame
        f.setSize(300, 300);
        f.show();
    }
    // if the button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
// set the text of the label to the text of the field
            l.setText(jt.getText() + ", ");
            l1.setText(jt.getLineCount() + " lines");
        }
        else if (s.equals("bold")) {
// set bold font
            Font f = new Font("Serif", Font.BOLD, 15);
            jt.setFont(f);
        }
        else if (s.equals("italic")) {
// set italic font
            Font f = new Font("Serif", Font.ITALIC, 15);
            jt.setFont(f);
        }
        else if (s.equals("plain")) {
// set plain font
            Font f = new Font("Serif", Font.PLAIN, 15);
            jt.setFont(f);
        }
    }
}