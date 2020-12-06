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
      "%s%s出一張票。%s:%s",date,(price==10?"送":"售"),(price==10?"貴賓":"票價"),(price==10?name:Integer.toString(price))
    );
  }
}