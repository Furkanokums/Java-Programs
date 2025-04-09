import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label;
    JTextField textField1;
    JTextField textField2;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup group;
    JButton button;

    TemperatureConverter() {

        frame = new JFrame("Temperature Converter");
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Enter Temperature :");
        label.setBounds(50,10,150,25);
        frame.add(label);

        textField1 = new JTextField();
        textField1.setBounds(200,10,150,25);
        frame.add(textField1);

        button = new JButton("Convert");
        button.setBounds(200,50,150,25);
        button.addActionListener(this);
        frame.add(button);

        radioButton1 = new JRadioButton("Fahrenheit");
        radioButton1.setBounds(200,90,100,25);
        frame.add(radioButton1);

        radioButton2 = new JRadioButton("Celcius");
        radioButton2.setBounds(300,90,100,25);
        frame.add(radioButton2);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        textField2 = new JTextField();
        textField2.setBounds(200,150,150,25);
        textField2.setEditable(false);
        frame.add(textField2);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            if (radioButton1.isSelected()) {
                float temp = Float.parseFloat(textField1.getText());
                float F = (temp * 9)/5 + 32;
                String FString = String.valueOf(F);
                textField2.setText(FString + " Fahrenheit");
            }
            if (radioButton2.isSelected()) {
                float temp1 = Float.parseFloat(textField1.getText());
                float C = ( (temp1 - 32)  * 5) / 9 ;
                String CString = String.valueOf(C);
                textField2.setText(CString + " Celcius");
            }
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }


}
