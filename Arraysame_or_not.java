Problem:

The Modern World Cinderella was happy to meet Prince Charming at the ballroom and she danced with him happily. While she was dancing, Prince wanted to check whether Cinderella is a perfect match for him. He asked her a question to check her knowledge of Arrays. Can you help Cinderella to write a program to find whether the two arrays are the same or not?

Note: Two arrays are said to be the same if the sum of both arrays is the same and the size of the arrays is the same.

Input Format

Input consists of 2 integers and 2 arrays. The integers should correspond to the size of the arrays.

Constraints

NA

Output Format

If two arrays are the same, display "Same" else display "Not Same"

Sample Input 0

4
4
1
2
3
4
1
2
3
4
Sample Output 0

Same

Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int s=0;
        int t=0;
        if(n1==n2){
            for(int i=0;i<n1;i++){
                s=s+arr1[i];
                t=t+arr2[i];
            }
            if(s==t){
                System.out.print("Same");
            }else{
                System.out.print("Not Same");
            
        }
        }else{
                System.out.print("Not Same");
            }   
    }
}