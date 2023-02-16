import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setBounds(250, 0, 250, 250);

        JLabel label = new JLabel();
        label.setText("HELLO");
        label.setForeground(Color.WHITE);

        JFrame frame = new JFrame(); //Create
        frame.setTitle("My First UI"); //Set Title
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        frame.setResizable(false); //cannot resize
        frame.setSize(750, 750); //Set x-dimension and y-dimension of the frame
        frame.setVisible(true); //make the frame visible

        panel.add(label);
        frame.add(panel);
    }
}
