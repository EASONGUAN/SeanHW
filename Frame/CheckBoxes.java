package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxes extends JFrame implements ActionListener {

    JCheckBox checkBox;
    JCheckBox checkbox1;
    JButton button;

    public CheckBoxes(){

        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot");
        checkBox.setFocusable(false);

        checkbox1 = new JCheckBox();
        checkbox1.setText("I am a robot");
        checkbox1.setFocusable(false);

        button = new JButton("Submit");
        button.addActionListener(this);

        this.add(checkBox);
        this.add(checkbox1);
        this.add(button);

        this.setTitle("CheckBoxes"); //Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        this.pack();
        this.setSize(400,200);
        this.setLayout(new FlowLayout());
        this.setVisible(true); //make the frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            System.out.println(checkBox.isSelected());
        }

    }

    public static void main (String[] args){
        CheckBoxes cb = new CheckBoxes();
    }
}
