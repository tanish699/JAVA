import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello" + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age")); 
        // Integer.parseInt is to convert it to integer
        JOptionPane.showMessageDialog(null, "You are " +age+"years old");
    }
    
}
