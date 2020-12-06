
public class Student1 {
  private String name;
  private String address;
  private int[] score=new int[5];

  public Student1(String name, String address, int[] score)
  {
    this.name=name;
    this.address=address;
    this.score=score;

  }
  public int printAvg(int[] x)
  {
    int total=0;
    for(int i=0;i<x.length;i++)
    {
      total+=x[i];
    }
    int average=total/x.length;
    return average;
  }
}