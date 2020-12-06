import java.util.Scanner;
import java.util.Random;
public class Do_while{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       Random r = new Random();
        int count=0;
       int correct = 0;
       System.out.printf("線上測驗開始...\n");
       do{
        int  number1= r.nextInt(9)+1;
        int  number2 = r.nextInt(9)+1;
        int answer=number1*number2;
        System.out.printf("%d x %d =?",number1,number2);
        int h_answer=s.nextInt();
        count++;
        if (h_answer==answer)
        {
            correct+=1;
        };

       }
       while(count<5);
       
       if (correct>=4)
       {
           System.out.print("wonderful");
       }

        

    }
}