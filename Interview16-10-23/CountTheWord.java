
import java.util.Scanner;

public class CountThe {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();    // read a string
         sc.close();
         String word[] = str.toLowerCase().split(" ");
         int count = 0;
         for(String ch:word)
         {
              count++;  
         }
         int countword=0;
         for(int i=0;i<count;i++)
         {
            if(word[i] == "the" && word[i+1] !="a")
            {
                    countword++;
            }
         }
         System.out.println(countword);
     }
}
