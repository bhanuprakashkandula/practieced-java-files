//Febbinocci series
import java.util.Scanner;
class Practiece_4
  {
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int f=0,s=1,sum=0,n,i;
      n=sc.nextInt();
      for(i=1;i<n;i++)
        {
          sum=f+s;
          f=s;
          s=sum;
          System.out.println(sum);
        }
    }
  }
  