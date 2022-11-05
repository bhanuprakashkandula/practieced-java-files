//Write a JAVAprogram to check whether a number is negative, positive or zero.
import java.util.Scanner;
class Negposszero
{
 public static void main(String args[])
  {
    int n;
    Scanner s =new Scanner(System.in);  
    System.out.println("enther n the number");
    n=s.nextInt();
    if(n<0)
    {
      System.out.println("it is negitive");
    }  
    else if(n>0)
    {
      System.out.println("it is possitive");
    }   
    else
    {
      System.out.println("it is zero");
    }   
  }
}