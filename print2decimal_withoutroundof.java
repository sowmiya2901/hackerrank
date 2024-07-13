problem:
Write a program to print the details of a student. The student's details consist of his/her name, age, CGPA, and grade.
Input Format
The input consists of one string, one integer, one float, and one character. The string corresponds to the name of a student. The integer corresponds to the age of a student. The float corresponds to the CGPA of a student. The character corresponds to the grade of a student.
Constraints
The CGPA (float value) should be printed with 2 decimal places.
Output Format
The output prints all the details of a student. Refer to the sample Output.

Sample Input 0

Rajeev
20
8.6467
B
Sample Output 0

Name: Rajeev
Age: 20
CGPA: 8.64
Grade: B


Solution

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        Double cgpa=sc.nextDouble();
        String c=sc.next();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        BigDecimal bd=new BigDecimal(cgpa).setScale(2,RoundingMode.FLOOR);
        double tr=bd.doubleValue();
        System.out.printf("CGPA: %.2f\n",tr);
        System.out.println("Grade: "+c);
        sc.close();
    }
}
