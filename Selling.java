/*�m�J1�Gif not defining explicit constructor, Java provides a default/implicit constructor.
�m�J2�G-d ���͸�Ƨ��C*/
public class Selling {
  public static void main(String[] args){
    Ticket t1=new Ticket("2020/4/25",250);
    Ticket t2=new Ticket("2020/4/26","Johnny Chen");
    
    
    System.out.println(t1);
    System.out.println(t2);
  }
}