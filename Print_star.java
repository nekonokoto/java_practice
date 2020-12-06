import java.util.Scanner;
public class Print_star{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.printf("how many stars");
        int floor=s.nextInt();
        for(int i=0;i<floor;i++)
        {
            for (int j=1;j>=i;j++)
            {   if (j<=i){
                System.out.print(" ");
                
                }
                else{
                    System.out.printf("*");
                   
                }
            }
            System.out.println("");
        }

    }
}