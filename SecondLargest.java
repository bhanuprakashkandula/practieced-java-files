import java.util.Scanner;
class SecondLargest 
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter the size of an array");
      n=sc.nextInt();
      int a[]=new int [n];
         /* int a1[]=new int [n];
      int a2[]=new int[a1.length];
      for(int i=0;i<a1.length;i++)
        {
          a2[i]=a1[i];
        }
       System.out.println();
      for(int i=0;i<a1.length;i++)
        {
           System.out.println(a1[i]+"");
        }
      for(int i=0;i<a2.length;i++)
        {
          System.out.println(a2[i]+""); 
        }*/
      System.out.println("Enter the elements in array");
      for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        //for(int i=0;i<n;i++)
         // {
             //System.out.println("the elements in array"+a[i]);
        //  }
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1-i;j++)
            {
              if(a[j]>a[j+1])
              {
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
              }
            }
        }
      System.out.println("Seconnd largest element:");
  //for(int i=0;i<n;i++)
        {
          System.out.println(""+a[n-2]);
        }
      
      
    }
  }
