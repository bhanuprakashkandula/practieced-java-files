 import java.util.Scanner;
class Practiece_11
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int s1,s2,i,j;
      s1=sc.nextInt();
      s2=sc.nextInt();
      for(i=s1;i<s2;i++)
        {
          for(j=2;j<i;j++)
            {
              if(i%j==0)
               break;
            }
          if(i==j)
          {
            System.out.println(j+"");
          }
        }
    }
  }