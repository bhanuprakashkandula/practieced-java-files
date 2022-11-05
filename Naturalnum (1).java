//Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
class Naturalnum
  {
    public static void main(String[]args)
    {
      Scanner sc= new Scanner(System.in);
      int n,i=1;
      System.out.println("enter the natural number:  ");
      n=sc.nextInt();
      while(i<=n)
        {
          System.out.println(i);
          i++;
        }
    }
  }