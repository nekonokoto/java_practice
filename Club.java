
import java.util.ArrayList;
public class Club {
  private  ArrayList<Member> c= new ArrayList<Member>();
  
  public void addMember(Member m ){
    c.add(m);
  }
  public String getMember(){
    String output="";
    for(int i=0;i<c.size();i++){
      output+=c.get(i)+"\n";
    }
    return output;
  }
  public int totalFees(){
    int total=0;
    for(int j =0;j<c.size();j++)
    {
      total+=c.get(j).getFee();

    }
    return total;
  }
  public String toString(){
    return getMember();
  }
}