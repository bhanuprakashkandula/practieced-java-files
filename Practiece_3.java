import java.util.Scanner;
class Practiece_3
  {
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int i=0,j;
      String Strword;
      Strword=sc.nextLine();
      String[]RevWord=Strword.split(" ");
      while(i<RevWord.length)
        {
          char[]ch=RevWord[i].toCharArray();
          j=ch.length-1;
          while(j>=0)
            {
              System.out.print(ch[j]);
              j--;
            }
          System.out.print(" ");
          i++;
        }
    }
  }
 
  