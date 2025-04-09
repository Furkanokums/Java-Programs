import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserDetailsForm extends JFrame implements ActionListener {

    JFrame frame;
    JLabel label1;
    JTextField textField;
    JLabel label2;
    JRadioButton radioButton1;
    JRadioButton radioButton2;
    ButtonGroup group;
    JLabel label3;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JLabel label4;
    JComboBox<String> comboBox;
    JButton button;

    UserDetailsForm() {
        frame = new JFrame("User Details Form");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        label1 = new JLabel("Enter your name :");
        label1.setBounds(50,10,150,25);
        frame.add(label1);

        textField = new JTextField();
        textField.setBounds(200,10,150,25);
        frame.add(textField);

        label2 = new JLabel("Select Gender :");
        label2.setBounds(50,50,150,25);
        frame.add(label2);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setBounds(200,50,100,25);
        frame.add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setBounds(300,50,100,25);
        frame.add(radioButton2);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        label3 = new JLabel("Select Hobbies :");
        label3.setBounds(50,90,150,25);
        frame.add(label3);

        checkBox1 = new JCheckBox("Reading");
        checkBox1.setBounds(200,90,100,25);
        frame.add(checkBox1);

        checkBox2 = new JCheckBox("Sports");
        checkBox2.setBounds(200,120,100,25);
        frame.add(checkBox2);

        checkBox3 = new JCheckBox("Music");
        checkBox3.setBounds(200,150,100,25);
        frame.add(checkBox3);

        label4 = new JLabel("Select Country :");
        label4.setBounds(50,200,150,25);
        frame.add(label4);

        String[] list = {"Turkey", "USA", "UK", "France"};
        comboBox = new JComboBox<>(list);
        comboBox.setBounds(200,200,150,25);
        frame.add(comboBox);

        button = new JButton("Sumbit");
        button.setBounds(200,250,150,25);
        button.addActionListener(this);
        frame.add(button);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String s = "";
            s+= "Name: " + textField.getText() + "\n";
            if (radioButton1.isSelected()) {
                s+= "Gender: " + radioButton1.getText() + "\n";
            }
            else if (radioButton2.isSelected()) {
                s+= "Gender: " + radioButton2.getText() + "\n";
            }
            String selected = "";
            if (checkBox1.isSelected()) {
                selected += checkBox1.getText() + ",";
            }
            if (checkBox2.isSelected()) {
                selected += checkBox2.getText() + ",";
            }
            if (checkBox3.isSelected()) {
                selected += checkBox3.getText() + " ";
            }
            s += "Hobbies: " + selected + "\n";

            String country = (String) comboBox.getSelectedItem();
            s += "Country: " + country + "\n";

            JOptionPane.showMessageDialog(null,s,"Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);

        }

    }

    public static void main(String[] args) {
        new UserDetailsForm();
    }



}
