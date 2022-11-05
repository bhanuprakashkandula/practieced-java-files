import java.util.Scanner;
class Practiece_6
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,i,sum=0,rem;
      System.out.println("Enetr the number");
      n=sc.nextInt();
      int temp=n;
      while(n>0) 
        {
        rem=n%10;
          sum=(sum)+rem;
          n=n/10;
          {
            System.out.println(sum);
          }
        }
    }
  }