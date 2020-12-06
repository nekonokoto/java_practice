public class Registeration {
  public static void main(String [] args){
    UnderGraduate u1=new UnderGraduate("Mary","MIS");
    u1.addCredits(21);
    u1.addCredits(15);
    u1.setHonor(false);
    System.out.println(u1.tuition());
    Graduate g1=new Graduate("Mary","MIS","lili");
    g1.addCredits(20);
    System.out.println(g1.tuition());
  }
}