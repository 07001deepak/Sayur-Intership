// 1.Write a program for Collatz_conjecture.
// Collatz_conjecture means -  start with the input number. 
// For even number , divide by 2 (n/2)
// For odd number - 3n + 1
// apply the above for the resulting number until the answer is 1.Eg, input is 8
// output 8, 4,2, 1
// input is 9
// output 9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1

// Get two numbers as input. Print the number that has less number of steps to reach 1.

import java.util.Scanner;
public class CollatzConjecture{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 value");
        int n1 = sc.nextInt();
        int temp1 = n1;
        System.out.println("Enter n2 value");
        int n2 = sc.nextInt();
        int temp2 = n2;
        int c1=0;
        int c2=0;
        while(n1>0){
            if(n1==1){
                System.out.print(n1);
                break;
            }
            else if(n1%2==0){
                 System.out.print(n1 + ",");
                  n1 = n1/2;
            }
            else{
                System.out.print(n1 + ",");
                n1 = (3 * n1)+1;
            }
            c1++;
        }
        System.out.println();
        while(n2>0){
            if(n2==1){
                System.out.print(n2);
                break;
            }
            else if(n2%2==0){
                 System.out.print(n2 + ",");
                  n2 = n2/2;
            }
            else{
                System.out.print(n2 + ",");
                n2 = (3 * n2)+1;
            }
            c2++;
        }
        System.out.println();
        if(c1<c2)
        System.out.println("Input" + " " + temp1 + " " + "has less number of steps to reach 1");
        else
        System.out.println("Input" + " " + temp2 + " " + "has less number of steps to reach 1");
    }
}

// Output

// Enter n1 value
// 8 
// Enter n2 value
// 9 
// 8,4,2,1
// 9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
// Input 8 has less number of steps to reach 1


