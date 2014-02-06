import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame {
    private JLabel label;
    private JTextField textfield;
    private JButton button;
    private JCheckBox cboxb;
    private JCheckBox cboxi;

    public tomeddle() {
        setLayout(new FlowLayout());
        label = new JLabel("");
        add(label);
        textfield = new JTextField("CLICK BUTTON FOR SOME ACTION", 15);
        textfield.setFont(new Font("Serif", Font.PLAIN, 20));
        add(textfield);
        button = new JButton("HERE U CLICK TO MAKE ANY  CHANGE");
        add(button);
        event e = new event();
        button.addActionListener(e);
    }

    private class event implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cboxb = new JCheckBox("BOLD");
            cboxi = new JCheckBox("ITALIC");
            event1 e1 = new event1();
            cboxb.addItemListener(e1);
            cboxi.addItemListener(e1);
            add(cboxb);
            add(cboxi);

        }
    }

    private class event1 implements ItemListener {
        public void itemStateChanged(ItemEvent event1) {
            Font font = null;
            if (cboxb.isSelected() && cboxi.isSelected())
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
            else if (cboxb.isSelected())
                font = new Font("Serif", Font.BOLD, 20);
            if (cboxi.isSelected())
                font = new Font("Serif", Font.ITALIC, 20);
            else
                font = new Font("Serif", Font.PLAIN, 20);
            textfield.setFont(font);
        }
    }

    public static void main(String args[]) {
        tomeddle obj1 = new tomeddle();
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj1.setSize(200, 150);
        obj1.setVisible(true);
    }
}
