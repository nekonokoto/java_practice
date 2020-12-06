
public class Student {
  protected String name;
  protected String major;
  protected  int credits=0;
  public Student(String name , String major){
    
    this.major=major;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setMajor(String major){
    this.major=major;
  }
  public int tuition(){
    return 1500 * getCredits();
  }
  public void  addCredits(int credits){
    this.credits=credits;
  }
  public int getCredits(){
    return credits;
  }
}
