import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JFrame frame;
    JTextField textField1;
    JTextField textField2;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel label;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField1 = new JTextField();
        textField1.setBounds(50,10,50,25);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(100,10,50,25);
        frame.add(textField2);

        button1 = new JButton("ADD(+)");
        button1.setBounds(50,50,100,25);
        button1.addActionListener(this);
        frame.add(button1);

        button2 = new JButton("SUB(-)");
        button2.setBounds(50,75,100,25);
        button2.addActionListener(this);
        frame.add(button2);

        button3 = new JButton("MUL(*)");
        button3.setBounds(50,100,100,25);
        button3.addActionListener(this);
        frame.add(button3);

        button4 = new JButton("DIV(/)");
        button4.setBounds(50,125,100,25);
        button4.addActionListener(this);
        frame.add(button4);

        label = new JLabel("Result");
        label.setBounds(50,175,100,25);
        frame.add(label);






        frame.setVisible(true);

    }
     @Override
     public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double add = num1 + num2;
            String addS = String.valueOf(add);
            label.setText("Result :" + addS);
        }
         else if (e.getSource() == button2) {
             double num1 = Double.parseDouble(textField1.getText());
             double num2 = Double.parseDouble(textField2.getText());
             double sub = num1 - num2;
             String subS = String.valueOf(sub);
             label.setText("Result :" + subS);
         }
         if (e.getSource() == button3) {
             double num1 = Double.parseDouble(textField1.getText());
             double num2 = Double.parseDouble(textField2.getText());
             double mul = num1 * num2;
             String mulS = String.valueOf(mul);
             label.setText("Result :" + mulS);
         }
         if (e.getSource() == button4) {
             double num1 = Double.parseDouble(textField1.getText());
             double num2 = Double.parseDouble(textField2.getText());
             if (num2 == 0) {
                 JOptionPane.showMessageDialog(null,"Amk evladı sıfıra bölünür mü","ANANINI SIKERIM",JOptionPane.ERROR_MESSAGE);
             }
             double div = num1 / num2;
             String divS = String.valueOf(div);
             label.setText("Result :" + divS);
         }
     }

    public static void main(String[] args) {
        new Calculator();
    }
}
