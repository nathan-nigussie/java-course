import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
       String name=JOptionPane.showInputDialog("Enter Your Name");
       JOptionPane.showMessageDialog(null,"hello" + name);
       int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
       JOptionPane.showMessageDialog(null,"You are " + age + "years old");

       //if we want to parse a double value
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"You are " + height + "CM");





    }
}