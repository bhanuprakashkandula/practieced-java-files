import java.util.Scanner;
class Strongnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int temp,rem,fact,sum=0;
      temp=n;
     while(n>0)
        {
          rem=n%10;
          fact=1;
          while(rem>0)
            {
              fact=fact*rem;
              rem=rem-1;
            }
          sum=sum+fact;
          n/=10;
        }
      if(temp==sum)
      {
        System.out.println("it is strong number");
      }
      else
      {
        System.out.println("it is not strong number");

      }
    }
  }
import java.util.Scanner;
class Strongnum
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number :");
      int n=sc.nextInt();
      int temp,rem,fact,sum=0;
      temp=n;
     while(n>0)
        {
          rem=n%10;
          fact=1;
          while(rem>0)
            {
              fact=fact*rem;
              rem=rem-1;
            }
          sum=sum+fact;
          n/=10;
        }
      if(temp==sum)
      {
        System.out.println("it is strong number");
      }
      else
      {
        System.out.println("it is not strong number");

      }
    }
  }