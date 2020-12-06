

public class Member {
  private int fee;
  private String name;
  public Member(String name , int fee)
  {
    this.fee=fee;
    this.name=name;
  }
  public int getFee()
  {
    return fee;
  }
  public String toString(){
    return String.format("%-5s   Membership fee : %d",name,fee);
   
  }

}