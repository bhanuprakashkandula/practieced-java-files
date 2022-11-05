/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
*/
import java.util.Scanner;

public class Expression 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a=sc.nextInt();
        System.out.println("Enter b value: ");
        int b=sc.nextInt();
         b=a-- - --a;
        System.out.println("a-- - -- is: "+b);
        int c=a--;
        System.out.println("a-- is: "+c);
        int d=a>>2;
        System.out.println("a>>2 is: "+d);
        int e=a&b;
        System.out.println("a&b is: "+e);
        
    }
}

//import statements for java program to read inputs using Scanner class
 
//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter a value: ");
  int a=sc.nextInt();
*/

//print appropriate result for Expression operators

