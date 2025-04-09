import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadixConversion extends JFrame implements ActionListener {

    JFrame frame;
    JTextField textField1;
    JTextField textField2;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    JRadioButton radioButton3;
    ButtonGroup group;


    RadixConversion() {
        frame = new JFrame("Text Converter");
        frame.setLayout(null);
        frame.setSize(500,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);


        textField1 = new JTextField();
        textField1.setBounds(20,10,250,25);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(20,50,250,25);
        frame.add(textField2);

        radioButton1 = new JRadioButton("Decimal");
        radioButton1.setBounds(20,90,100,25);
        radioButton1.addActionListener(this);
        frame.add(radioButton1);

        radioButton2 = new JRadioButton("Binary");
        radioButton2.setBounds(130,90,100,25);
        radioButton2.addActionListener(this);
        frame.add(radioButton2);

        radioButton3 = new JRadioButton("Hex");
        radioButton3.setBounds(250,90,100,25);
        radioButton3.addActionListener(this);
        frame.add(radioButton3);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == radioButton1) {
            textField2.setText(textField1.getText());
        }
        else if (e.getSource() == radioButton2) {
            String binary = Integer.toBinaryString(Integer.parseInt(textField1.getText()));
            textField2.setText(binary);
        }
        else if (e.getSource() == radioButton3) {
            String hex = Integer.toHexString(Integer.parseInt(textField1.getText()));
            textField2.setText(hex);
        }
    }

    public static void main(String[] args) {
        new RadixConversion();
    }

}
