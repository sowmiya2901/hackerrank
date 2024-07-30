Problem:

Jaffer wanted to excel in Math. He was learning about the Kaprekar number from Meena, his Maths teacher. She gave him a few random numbers and asked him to find out whether they are Kaprekar number or not.

(Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. If the resultant sum is k, then k is called a Kaprekar number. For example, 9 is a Kaprekar number since 9^2 = 81 & 8 + 1 = 9, similarly, 297 is a Kaprekar number as 297^2 = 88209 & 88 + 209 = 297 ).

Can you help Jaffer to write a program to find whether the given number is a Kaprekar number or not?

Input Format

Input consists of a single integer.

Constraints

NA

Output Format

If the output is a Kaprekar number print "Kaprekar Number" else "Not a Kaprekar Number".

Sample Input 0

45
Sample Output 0

Kaprekar Number

solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int s=p;
        int n=p*p;
        int t=n;
        int k=1;
        int c=0;
        while(n!=0){
            int r=n%10;
            c++;
            n=n/10;
        }
        if(c%2==0){
            int s1=0;
            for(int i=0;i<c/2;i++){
                int r=t%10;
                s1=s1+(r*k);
                t=t/10;
                k=k*10;
            }
            if((t+s1) == s){
                System.out.print("Kaprekar Number");
            }else{
                System.out.print("Not a Kaprekar Number"); 
                System.out.print(t+s1);
                System.out.print(s);
            }
        }else{
            int s1=0;
            int s2=0;
            for(int i=0;i<c/2;i++){
                int r=t%10;
                s1=s1+(r*k);
                t=t/10;
                k=k*10;
            }
            for(int i=0;i<(c/2)+1;i++){
              int r=t%10;
                s2=s2+(r*k); 
                t=t/10;
                k=k*10;
            }
            if(s1==s && s2==s){
                System.out.print("Kaprekar Number");
            }else{
                System.out.print("Not a Kaprekar Number");
            }
        }
        
    }
}