import javax.swing.*;
import java.awt.*;

public class main3 {
    public static void main(String[] args)
    {
        //Create Image
        ImageIcon image = new ImageIcon("C:\\Kobe.png");

        //Create Label and add to the JFrame
        JLabel label = new JLabel();
        label.setText("HELLO");
        label.setIcon(image);

        label.setForeground(Color.GREEN);//set text color
        label.setFont(new Font("Some Label", Font.ITALIC, 20));//set Font

        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT/CENTER/RIGHT of the image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP/CENTER/BOTTOM of the image icon

        //SET THE LABEL POSITION
        label.setBounds(50, 50, 20, 20);

        JFrame frame = new JFrame(); //Create
        frame.setTitle("My First UI"); //Set Title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close
        //frame.setResizable(false); //cannot resize
        frame.setSize(500, 500); //Set x-dimension and y-dimension of the frame
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true); //make the frame visible
        //frame.pack(); //make everything responsive
    }
}
