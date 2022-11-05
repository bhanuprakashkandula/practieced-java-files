/*import java.util.Scanner;
class Practiece_14
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter the size of an array:");
      n=sc.nextInt();
    int a[]=new int[n];
      System.out.println("ENter the elemnts in an array:");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1-i;j++)
            {
             if( a[j]>a[j+1])
             {
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
               temp=a[j+1];
             }
            }
        }
      System.out.println("Elements after soring");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
  }*/
import java.util.Scanner;
class Practiece_14
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enetr the size of array:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Elements in the array");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                int temp=a[j];
                a[i]=a[j+1];
                a[j+1]=temp;
                temp=a[j+1];
              }
            }
        }
      System.out.println("Elements ofter Sorting:");
      for(int i=0;i<n;i++)
      {
        System.out.println(a[i]);
      }
    }
  }