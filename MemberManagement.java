/*�m�J1:�զ��G�զ��餣�s�b�ɺc����������]�L�s�b���n�C
�E�X�G�E�X�餣�s�b�ɺc���������󤴥i�s�b��t�ΡC*/
/*�m�J2:�P�ǭn��qUser class�P�_�X�D�ؤ���entity classes��members�H�ά����W��(�p��k�O�_���ѼƻP�^�ǵ�)*/
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