//Write a JAVAprogram to check whether a year is leap year or not.
import java.util.Scanner;
class Leapornot
  {
    public static void main(String[]args)
    {
      Scanner sc =new Scanner(System.in);
      int year;
      System.out.println("enter the year:");
      year =sc.nextInt();
      if(year%4==0)
      {
        System.out.println("it is a leap year");
      }
      else
      {
     System.out.println("it is not a leap year");   
      }
    }
  }