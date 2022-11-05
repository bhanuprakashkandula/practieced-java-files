//Armstrong number
import java.util.Scanner;
class Practiece_8
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,temp,sum=0,rem;
      System.out.println("Enter the number");
      n=sc.nextInt();
      temp=n;
      while(n!=0)
        {
          rem=n%10;
          sum=(sum)+rem*rem*rem;
          n=n/10;
        }
          if(temp==sum)
          {
            System.out.println("yes");
          }
          else
          {
            System.out.println("no");
          }
    }
  }