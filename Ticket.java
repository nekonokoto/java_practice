public class Ticket {
  private int price;
  private String date;
  private String name;
  public Ticket(String date,int price )
  {
    this.price=price;
    this.date=date;
  }
  public Ticket( String date, String name)
  {
    this.price=10;
    this.date=date;
    this.name=name;
  }
  public String toString(){
    return String.format(
      "%s%s�X�@�i���C%s:%s",date,(price==10?"�e":"��"),(price==10?"�Q��":"����"),(price==10?name:Integer.toString(price))
    );
  }
}