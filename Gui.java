import javax.swing.JOptionPane;;
public class Gui{
    public static void main(String[] args)
    {
        int age=0;
        String input = JOptionPane.showInputDialog("你的年齡");
        age=Integer.parseInt(input);
        if(age>=18)
        {
            JOptionPane.showMessageDialog(null,"你是成年人");
        }
        else{
            JOptionPane.showMessageDialog(null, "禁止進入");
        }
    }
}