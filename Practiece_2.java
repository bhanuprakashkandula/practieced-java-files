import java.util.Scanner;
class Practiece_2
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      str=sc.nextLine();
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
            System.out.print(str.charAt(i));
            }
        }
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='0' && str.charAt(i)<='9')
          {
            System.out.print(str.charAt(i));
          }
        }
    }
  }