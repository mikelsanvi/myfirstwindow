package org.example;

import javax.swing.*;
import java.awt.*;

public class MyForm {
    private JButton acceptButton;
    private JPanel mainPanel;
    private JButton cancelButton;
    private JButton button2;
    private JButton button3;
    private JTextField HOlaMundoTextField;
    private JButton button1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    private JComboBox comboBox1;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyForm myForm = new MyForm();
        frame.setVisible(true);
        frame.setSize(new Dimension(400,400));
        frame.setContentPane(myForm.mainPanel);

        frame.repaint();
        frame.revalidate();
    }
}
