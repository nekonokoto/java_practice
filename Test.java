import java.util.Scanner;
import java.util.Random;
public class Test{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       Random r = new Random();
      
       int correct = 0;
       System.out.printf("線上測驗開始...\n");
       for(int i=0;i<5;i++)
       {
           int  number1= r.nextInt(9)+1;
           int  number2 = r.nextInt(9)+1;
           int answer=number1*number2;
           System.out.printf("%d x %d =?",number1,number2);
           int h_answer=s.nextInt();
           if (h_answer==answer)
           {
               correct+=1;
           };

           

       }
       if (correct>=4)
       {
           System.out.print("wonderful");
       }

        

    }
}