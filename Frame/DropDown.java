package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropDown extends JFrame implements ActionListener {

    JComboBox comboBox;

    public DropDown(){

        String[] animals = {"Dog", "Cat", "Bird"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        this.add(comboBox);


        this.setTitle("DropDown"); //Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        this.pack();
        this.setSize(400,200);
        this.setLayout(new FlowLayout());
        this.setVisible(true); //make the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }

    public static void main(String[] args){
        new DropDown();
    }
}
