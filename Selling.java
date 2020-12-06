/*彩蛋1：if not defining explicit constructor, Java provides a default/implicit constructor.
彩蛋2：-d 產生資料夾。*/
public class Selling {
  public static void main(String[] args){
    Ticket t1=new Ticket("2020/4/25",250);
    Ticket t2=new Ticket("2020/4/26","Johnny Chen");
    
    
    System.out.println(t1);
    System.out.println(t2);
  }
}