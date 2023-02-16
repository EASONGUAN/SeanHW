import javax.swing.JFrame;

public class main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame(); //Create

        frame.setTitle("My First UI"); //Set Title

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit the application when click close

        frame.setResizable(false); //cannot resize

        frame.setSize(420, 420); //Set x-dimension and y-dimension of the frame

        frame.setVisible(true); //make the frame visible
    }
}
