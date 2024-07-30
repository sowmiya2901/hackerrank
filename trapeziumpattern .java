Problem:

Write a program to print the trapezium pattern.

Input Format

Input consists of one integer that represents the number of rows.

Constraints

NA

Output Format

Output prints the pattern

Sample Input 0

4
Sample Output 0

1*2*3*4*17*18*19*20
--5*6*7*14*15*16
----8*9*12*13
------10*11


solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int s=(n*n)+1;
        int w=3;
        int o=2;
        int e=n-2;
        for(int i=0;i<n;i++){
             
            for(int k=0;k<i*2;k++){
             System.out.print("-");
            
            }
            for(int j=n-i;j>0;j--){
                System.out.print(a+"*");
                a++;
            }
            for(int m=n-i;m>1;m--){
              
                System.out.print(s+"*");  
                s++;
             

            }
            System.out.print(s);
            s=s-(n+e-i);
            e--;
            w-=2;
            
            System.out.println();
        }
        
    }
}