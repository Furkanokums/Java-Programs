import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounter extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label;
    JTextField textField;
    JButton button;


    AWTCounter() {
        frame = new JFrame("AWT Counter");
        frame.setLayout(null);
        frame.setSize(300,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel("Counter");
        label.setBounds(20,20,50,10);
        frame.add(label);

        textField = new JTextField("0");
        textField.setBounds(80,15,100,20);
        textField.setEditable(false);
        frame.add(textField);

        button = new JButton("Count");
        button.setBounds(200,15,80,20);
        button.addActionListener(this);
        frame.add(button);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button) {
            int n = Integer.parseInt(textField.getText());
            n++;
            String num = String.valueOf(n);
            textField.setText(num);
        }
    }
    public static void main(String[] args) {
        new AWTCounter();
    }


}
