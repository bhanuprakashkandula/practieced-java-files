import java.util.Scanner;
class SelectionSort
  {
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j,temp;
      System.out.println("Enter the array size");
      n=sc.nextInt();
      int arr[]=new int [n];
      System.out.println("Enetr the elements in an array");
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Elements after sorting");
      for(i=0;i<n;i++)
        {
              System.out.print(" "+arr[i]);
        }
      for(i=0;i<n-1;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              { 
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
            }
        }
        }
         System.out.println(" the elements after sorting is:");
      for(i=0;i<n;i++)
        {
             System.out.print("  "+arr[i]);
        }
    }
  }
