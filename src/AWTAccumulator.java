import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTAccumulator extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
    int sum = 0;

    GridLayout layout = new GridLayout(2,2,5,5);

    AWTAccumulator() {

        frame = new JFrame("AWT Accumulator");
        frame.setSize(500,150);
        frame.setLayout(layout);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Enter an integer :");
        label1.setSize(50,20);
        frame.add(label1);

        textField1 = new JTextField();
        textField1.setSize(50,20);
        textField1.addActionListener(this);
        frame.add(textField1);

        label2 = new JLabel("The Accumulated Sum is :");
        label2.setSize(50,20);
        frame.add(label2);

        textField2 = new JTextField();
        textField2.setSize(50,20);
        textField2.setEditable(false);
        frame.add(textField2);


        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textField1) {
            sum = sum + Integer.parseInt(textField1.getText());
            String sum1 = String.valueOf(sum);
            textField2.setText(sum1);
        }
    }

    public static void main(String[] args) {
        new AWTAccumulator();
    }
}
