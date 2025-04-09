import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextConverter extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label;
    JTextField textField;
    JButton button;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup group;
    JCheckBox checkBox;

    TextConverter() {
        frame = new JFrame("Text Converter");
        frame.setLayout(null);
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Input Text:");
        label.setBounds(50,10,150,25);
        frame.add(label);

        textField = new JTextField();
        textField.setBounds(150,10,200,25);
        textField.setEditable(false);
        frame.add(textField);

        button = new JButton("Convert to Uppercase");
        button.setBounds(150,40,200,25);
        button.addActionListener(this);
        frame.add(button);

        radioButton1 = new JRadioButton("Enable Editing");
        radioButton1.setBounds(50,100,150,25);
        radioButton1.addActionListener(this);
        frame.add(radioButton1);

        radioButton2 = new JRadioButton("Disable Editing");
        radioButton2.setBounds(200,100,150,25);
        radioButton2.addActionListener(this);
        frame.add(radioButton2);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        checkBox = new JCheckBox("Clear Text on Sumbit");
        checkBox.setBounds(50,150,150,25);
        checkBox.addActionListener(this);
        frame.add(checkBox);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radioButton1) {
            textField.setEditable(true);
        }
        if (e.getSource() == radioButton2) {
            textField.setEditable(false);
        }
        if (e.getSource() == button) {
            textField.setText(textField.getText().toUpperCase());
        }
        if (e.getSource() == checkBox) {
            textField.setText("");
        }
    }
    public static void main(String[] args) {
        new TextConverter();

    }

}
