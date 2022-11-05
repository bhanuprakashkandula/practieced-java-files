//Write a JAVAprogram to find maximum between three numbers
import java.util.Scanner;
class Maxthree
  {
  public static void main(String[]args)
    {
      Scanner sc =new Scanner(System.in);
    int a,b,c;
      System.out.println("Enter the three values:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && b>c)
      {
        System.out.println("a is max:="+a);
      }
      else
        if(b>a && b>c)
      {
        System.out.println("b is max:="+b);
      }
      else
      if(c>b && b>a)
      {
        System.out.println("c is max:="+c); 
      }
    }
  }