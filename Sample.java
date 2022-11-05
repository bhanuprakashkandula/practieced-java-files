/*import java.util.Scanner;
class Sample
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String str;
      System.out.println("entre the name:");
      str=sc.nextLine();
      String rev=" ";
      char []array=str.toCharArray();
      for(int i=str.length()-1;i>=0;i--)
        {
         rev=rev+str.charAt(i);
        }
       System.out.print(rev);
    }
  }*/
  import java.util.Scanner;
class Sample
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string name:");
     String str=sc.nextLine();
      String rev="";
      char[]Array=str.toCharArray();
      for(int i=str.length()-1;i>=0;i--)
        {
          rev=rev+str.charAt(i);
        }
      System.out.println(rev);
    }
  }