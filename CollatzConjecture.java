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
        System.out.println("Enter n value");
        int n = sc.nextInt();
        while(n>0){
            if(n==1){
                System.out.print(n);
                break;
            }
            else if(n%2==0){
                 System.out.print(n + ",");
                  n = n/2;
            }
            else{
                System.out.print(n + ",");
                n = (3 * n)+1;
            }
        }

    }
}

// Output:
// Enter n value
// 10
// 10,5,16,8,4,2,1

// Enter n value
// 8
// 8,4,2,1
