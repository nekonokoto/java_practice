//�m�J�GSo during instatiation, Java requires a constructor call for every object that is created@.
import javax.swing.JOptionPane;
public class Registration1 {
  public static void main (String[] args){
  String name=JOptionPane.showInputDialog(null, "�ǥͩm�W�G");
  String address=JOptionPane.showInputDialog(null,"�a�}�G");
  int [] s=new int [5];
  
  for(int i=0;i<5;i++)
  {
      s[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "���Z "+(i+1)+"�G"));
  };
  Student1 stk=new Student1(name,address,s);
  JOptionPane.showMessageDialog(null, "�ǥͩm�W�G"+name+" �`�������G"+stk.printAvg(s));

}
}