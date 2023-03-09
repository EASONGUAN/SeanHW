package Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrameDemo extends JFrame implements ActionListener {
    JButton button;
    JButton button1;
    JLabel label;

    ButtonFrameDemo() {
        button = new JButton();
        button.setBounds(200, 200, 200, 20);
        button.addActionListener(this);
        button.setText("Change Color");

        button1 = new JButton();
        button1.setBounds(200, 300, 200, 20);
        button1.addActionListener(this);
        button1.setText("Clear All");

        label = new JLabel();
        label.setText("HELLO");
        label.setForeground(Color.GREEN);//set text color
        label.setBounds(200, 50, 150, 150);

        this.setTitle("My First UI"); //Set Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        this.setSize(400, 400); //Set x-dimension and y-dimension of the frame
        this.setVisible(true); //make the frame visible
        this.setLayout(null);
        this.add(label);
        this.add(button);
        this.add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            label.setForeground(Color.RED);
        }
        if (e.getSource() == button1){
            this.getContentPane().removeAll();
            this.getContentPane().repaint();
            //SetGameBackground()
        }
    }

    public static void main(String[] args){
        new ButtonFrameDemo();
    }
}
