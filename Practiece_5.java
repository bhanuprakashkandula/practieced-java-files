//palindrom number or not
import java.util.Scanner;
class Practiece_5
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,rem,sum=0,temp;
      n=sc.nextInt();
       temp=n;
      while(n>0)
        {
         
        rem=n%10;
          sum=sum*10+rem;
          n=n/10;
        }
      if(temp==sum)
      {
        System.out.println("it is palindrom");
      }
      else
      {
        System.out.println("not");
      }
    }
  }