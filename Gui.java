import javax.swing.JOptionPane;;
public class Gui{
    public static void main(String[] args)
    {
        int age=0;
        String input = JOptionPane.showInputDialog("�A���~��");
        age=Integer.parseInt(input);
        if(age>=18)
        {
            JOptionPane.showMessageDialog(null,"�A�O���~�H");
        }
        else{
            JOptionPane.showMessageDialog(null, "�T��i�J");
        }
    }
}