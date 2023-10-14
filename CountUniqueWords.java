// 2. You are writing an essay. You don't want the any word to appear very frequently. Write a program that will take your essay as input (maybe from a file) and print the number of times each unique word appears in your essay.


import java.util.Scanner;

public class CountUniqueWords {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String essay = sc.nextLine();
            sc.close();
            String str[] =essay.toLowerCase().split(" ");
            int count=0;
            for (String ch : str)
            {
                count++;
            }
            System.out.println(count);
            int wordcount=0;
            for(int i=0;i<count;i++)
            {
                wordcount=0;
                for(int j=0;j<count;j++)
                {
                   if(str[i]==str[j])
                   {
                    wordcount++;
                   }
                    // str1[i]="o";
                }
                
               System.out.println( str[i] + " " + "appear" + " " +  wordcount + " "+"times");
            }
    }
}

// Output:

// I am deepak
// i appears 1 times
// am appears 1 times
// deepak appear 1 times