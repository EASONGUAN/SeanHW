package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButton extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hotdogButton;
    JRadioButton noodleButton;

    public RadioButton(){

        pizzaButton = new JRadioButton("Pizza");
        hotdogButton = new JRadioButton("HotDog");
        noodleButton = new JRadioButton("Noodle");

        pizzaButton.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hotdogButton);
        group.add(noodleButton);

        this.add(pizzaButton);
        this.add(hotdogButton);
        this.add(noodleButton);

        this.setTitle("RadioButton"); //Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        this.pack();
        this.setSize(400,200);
        this.setLayout(new FlowLayout());
        this.setVisible(true); //make the frame visible
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaButton){
            System.out.println("You Order Pizza");
        }
    }

    public static void main(String[] args){
        new RadioButton();
    }
}
