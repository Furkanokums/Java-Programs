import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LetterGradeCalculator extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JComboBox<Integer> comboBox1;
    JComboBox<Integer>  comboBox2;
    JComboBox<Integer> comboBox3;
    JButton button;

    LetterGradeCalculator() {

        frame = new JFrame("Letter Grade Calculator");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Grade");
        label1.setBounds(175,25,100,25);
        frame.add(label1);

        label2 = new JLabel("Credit");
        label2.setBounds(300,25,100,25);
        frame.add(label2);

        label3 = new JLabel("Course 1");
        label3.setBounds(50,75,75,25);
        frame.add(label3);

        label4 = new JLabel("Course 2");
        label4.setBounds(50,125,75,25);
        frame.add(label4);

        label5 = new JLabel("Course 3");
        label5.setBounds(50,175,75,25);
        frame.add(label5);

        label6 = new JLabel("Average");
        label6.setBounds(50,225,75,25);
        frame.add(label6);

        label7 = new JLabel("Letter Grade");
        label7.setBounds(50,275,100,25);
        frame.add(label7);

        textField1 = new JTextField();
        textField1.setBounds(175,75,50,25);
        frame.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(175,125,50,25);
        frame.add(textField2);

        textField3 = new JTextField();
        textField3.setBounds(175,175,50,25);
        frame.add(textField3);

        textField4 = new JTextField();
        textField4.setBounds(175,225,50,25);
        textField4.setEditable(false);
        frame.add(textField4);

        textField5 = new JTextField();
        textField5.setBounds(175,275,50,25);
        textField5.setEditable(false);
        frame.add(textField5);

        Integer arr[] = {1,2,3,4,5};
        comboBox1 = new JComboBox<Integer>(arr);
        comboBox1.setBounds(300,75,50,25);
        frame.add(comboBox1);

        comboBox2 = new JComboBox<Integer>(arr);
        comboBox2.setBounds(300,125,50,25);
        frame.add(comboBox2);

        comboBox3 = new JComboBox<Integer>(arr);
        comboBox3.setBounds(300,175,50,25);
        frame.add(comboBox3);


        button = new JButton("Check!");
        button.setBounds(50,325,200,50);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            float g1 = Float.parseFloat(textField1.getText());
            float g2 = Float.parseFloat(textField2.getText());
            float g3 = Float.parseFloat(textField3.getText());
            int c1 = (int) comboBox1.getSelectedItem();
            int c2 = (int) comboBox2.getSelectedItem();
            int c3 = (int) comboBox3.getSelectedItem();
            int totalCredit = c1+c2+c3;
            float totalGrade = (g1*c1) + (g2*c2) + (g3*c3);
            float avg = totalGrade / totalCredit;
            String sAvg = String.format("%.2f",avg);
            textField4.setText(sAvg);

            if (avg > 90) {
                textField5.setText("A");
            }
            else if (avg > 80) {
                textField5.setText("B");
            }
            else if (avg > 70) {
                textField5.setText("C");
            }
            else if (avg > 60) {
                textField5.setText("D");
            }
            else {
                textField5.setText("F");
            }
        }
    }

    public static void main(String[] args) {
        new LetterGradeCalculator();
    }
}
