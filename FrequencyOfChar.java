 /*import java.util.Scanner;
class FrequencyOfChar
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      char ch;
      int i,c=0;
      System.out.println("Enter the string");
      str=sc.nextLine();
      String s=str.toLowerCase();
      for(ch='a';ch<='z';ch++)
        {
          c=0;
          for(i=0;i<s.length();i++)
            {
              if(ch==s.charAt(i))
                c++;
            }
                if(c!=0)
          {
            System.out.print(ch+""+c);
          }
        }
        }
    }*/
 import java.util.Scanner;
class FrequencyOfChar
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      char ch;
      int i,c=0;
      System.out.println("Enter the string");
      str=sc.nextLine();
      String s=str.toLowerCase();
      for(ch='a';ch<='z';ch++)
        {
          c=0;
          for(i=0;i<s.length();i++)
            {
              if(ch==s.charAt(i))
                c++;
            }
              {
              if(c!=0)
              {
                System.out.println(ch+" "+c);
              }
              }
            
        }
    }
  }