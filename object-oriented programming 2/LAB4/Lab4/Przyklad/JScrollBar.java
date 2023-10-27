package Przyklad;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
public class JScrollBar extends JFrame{
    private javax.swing.JPanel JPanel;
    private javax.swing.JScrollBar scrollBar1;
    private JLabel label;
    public static void main(String[] args) {
        JScrollBar example = new JScrollBar();
        example.setVisible(true);
    }
    public JScrollBar() {
        super("JScrollBar");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:"+
                        scrollBar1.getValue());
            }
        });
    }
}
