import javax.swing.JOptionPane;

public class DialogViewer
{
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("What is your name?: ");
        System.out.printf("Hello "+name);
        String input= JOptionPane.showInputDialog("My name is Hal, what would you like me to do?: ");
        System.out.printf("\nI'm sorry "+name+", I'm afraid I cannot do that");
    }
}