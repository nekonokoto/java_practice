import javax.swing.JOptionPane;
public class Registration1 {
  public static void main (String[] args){
  String name=JOptionPane.showInputDialog(null, "學生姓名：");
  String address=JOptionPane.showInputDialog(null,"地址：");
  int [] s=new int [5];
  
  for(int i=0;i<5;i++)
  {
      s[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "成績 "+(i+1)+"："));
  };
  Student1 stk=new Student1(name,address,s);
  JOptionPane.showMessageDialog(null, "學生姓名："+name+" 總平均為："+stk.printAvg(s));

}
}
