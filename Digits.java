//. Write a JAVAprogram to count number of digits in a number.
/*import java.util.Scanner;
class Digits
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,count;
      System.out.println("Enter the number::  ");
      n=sc.nextInt();
      for(count=0;n>0;n=n/10)
        count=count+1;
      {
         System.out.println(" the number is::  "+count);
      }
    }
  }*/
 import java.util.Scanner;
class Digits
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,i,c;
      System.out.println("Enter the number:");
      n=sc.nextInt();
      for(c=0;n>0;n=n/10)
        {
          c++;
        }
      System.out.println(" "+c++);
    }
  }