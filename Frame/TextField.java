package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    TextField(){

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));

        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.GREEN);

        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(textField);
        this.add(button);

        this.setTitle("TextField"); //Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        this.pack();
        this.setSize(400,200);
        this.setLayout(new FlowLayout());
        this.setVisible(true); //make the frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println(textField.getText());
        }
    }


    public static void main(String[] args){
        TextField textField = new TextField();
    }
}
