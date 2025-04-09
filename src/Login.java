import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  implements ActionListener {

    private String userName = "Furkan";
    private String password = "1234";

    JFrame frame;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JPasswordField passwordField;
    JButton button;

    Login() {
        frame = new JFrame("LOGIN PAGE");
        frame.setBounds(500,300,400,200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);

        label1 = new JLabel("Username");
        label1.setBounds(100,0,100,25);
        frame.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(100,25,200,25);
        frame.add(textField1);

        label2 = new JLabel("Password");
        label2.setBounds(100,50,100,25);
        frame.add(label2);

        passwordField = new JPasswordField();
        passwordField.setBounds(100,75,200,25);
        frame.add(passwordField);

        button = new JButton("Login");
        button.setBounds(100,110,200,25);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        frame.add(button);



        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (textField1.getText().equals(userName) && passwordField.getText().equals(password)) {
                JOptionPane.showMessageDialog(null,"Girdin amk","Mesaj",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Siktir git ocpic","Mesaj",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }


}
