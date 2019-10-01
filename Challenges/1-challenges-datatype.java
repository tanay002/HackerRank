import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
int a;
double b;
String c=new String();
a=scan.nextInt();
b=scan.nextDouble();
c=s+""+scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
System.out.println(i+a);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+b);
        /* Concatenate and print the String variables on a Qnew line; 
            the 's' variable above should be printed first. */
System.out.println(c);
   
        scan.close();
    }
}