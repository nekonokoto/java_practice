public class Graduate extends Student {
  private String advisor;
  public Graduate(String name, String major, String advisor){
    super(name, major);
    setAdvisor(advisor);
  }
  public void setAdvisor(String advisor){
    this.advisor=advisor;
  }
}