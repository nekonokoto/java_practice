/*彩蛋1:組成：組成體不存在時構成它的物件也無存在必要。
聚合：聚合體不存在時構成它的物件仍可存在於系統。*/
/*彩蛋2:同學要能從User class判斷出題目中的entity classes的members以及相關規格(如方法是否有參數與回傳等)*/
public class MemberManagement {
    public static void main(String[] args)
    {
      Club c = new Club();
      c.addMember(new Member("John",200));
      c.addMember(new Member("Mary",500));
      c.addMember(new Member("Helen",100));
      System.out.print(c);
      System.out.println("Total revenue from membership fee : "+c.totalFees());
    }
}