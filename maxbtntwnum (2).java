//Write a JAVAprogram to find maximum between two numbers.
import java.util.Scanner;
class maxbtntwnum
{
  public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the two values:");
    a=sc.nextInt();
    b=sc.nextInt();
    if(a>b)
    {
      System.out.println("a is max :="+a);
    }
    else
    {
      System.out.println("b is max :="+b);
    }
    }
}